package com.shevelev.alpha_emoji_panel.popup

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.graphics.Point
import android.util.Size
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.PopupWindow
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shevelev.alpha_emoji_panel.R
import com.shevelev.alpha_emoji_panel.dto.TouchPoint
import com.shevelev.alpha_emoji_panel.icons_in_lists.ComplexIcon
import com.shevelev.alpha_emoji_panel.icons_in_lists.IconInGrid
import com.shevelev.alpha_emoji_panel.lists.ComplexIconsAdapter
import com.shevelev.alpha_emoji_panel.utils.UIHelper

/**
 * Popup for complex icons visualization
 */
class EmojiPopupComplexIcon(
    rootView: View,
    context: Context,
    private val parentActionsHandler: IconActions,
    iconToShow: ComplexIcon,
    touchPoint: TouchPoint
) : PopupWindow(context),
    IconActions {

    private val iconsListAdapter: ComplexIconsAdapter
    private val iconsList: RecyclerView

    init {
        // Create view
        @SuppressLint("InflateParams")
        contentView = (context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
            .inflate(R.layout.popup_emoji_complex, null, false)

        setBackgroundDrawable(null)
        isOutsideTouchable = true

        animationStyle = R.style.popupEmojiComplexAnimation

        val size = calculateSize(context, iconToShow.getChildIcons().size)
        setSize(size)

        val position = calculatePosition(context, size, touchPoint)
        showAtLocation(rootView, Gravity.NO_GRAVITY, position.x, position.y)

        // Setting up of icons list
        iconsListAdapter = ComplexIconsAdapter(this)
        iconsListAdapter.updateData(iconToShow.getChildIcons())

        iconsList = contentView.findViewById(R.id.iconsList)
        iconsList.adapter = iconsListAdapter
        iconsList.layoutManager = GridLayoutManager(context, iconToShow.getChildIcons().size)
    }

    override fun onIconClick(icon: IconInGrid, touchPoint: TouchPoint) {
        dismiss()
        parentActionsHandler.onIconClick(icon, touchPoint)
    }

    /**
     * Manually sets the popup window size
     */
    private fun setSize(size: Size) {
        width = size.width
        height = size.height
    }

    private fun calculateSize(context: Context, iconsQuantity: Int): Size {
        val iconSize = UIHelper.getDimension(context, R.dimen.popupEmojiComplexItemSize)
        val popupPadding = UIHelper.getDimension(context, R.dimen.popupEmojiComplexPadding)

        return Size(iconsQuantity * iconSize + popupPadding * 2, iconSize + popupPadding * 2)
    }

    private fun calculatePosition(context: Context, size: Size, touchPoint: TouchPoint): Point {
        val y = touchPoint.absolute.y - touchPoint.inView.y - size.height

        val x = touchPoint.absolute.x - size.width / 2

        if(x < 0) {
            return Point(0, y)
        }

        val screenSize = UIHelper.getRealScreenSize(context)
        if(x + size.width > screenSize.width) {
            return Point(screenSize.width - size.width, y)
        }

        return Point(x, y)
    }
}