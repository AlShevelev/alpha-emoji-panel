package com.shevelev.alpha_emoji_panel.lists

import android.content.Context
import android.graphics.Point
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.shevelev.alpha_emoji_panel.dto.TouchPoint
import com.shevelev.alpha_emoji_panel.icons_in_lists.IconInGrid
import com.shevelev.alpha_emoji_panel.popup.IconActions

abstract class IconViewHolderBase(
    context: Context,
    parentView: ViewGroup,
    @LayoutRes layoutResId: Int,
    private val iconActions: IconActions
) : RecyclerView.ViewHolder(LayoutInflater.from(context).inflate(layoutResId, parentView, false)) {

    private var touchPoint: TouchPoint? = null

    /**
     * UI elements must be initialized here
     */
    @CallSuper
    open fun init(item: IconInGrid) {
        itemView.setOnClickListener { iconActions.onIconClick(item, touchPoint!!) }

        itemView.setOnTouchListener { _, event ->
            if(event.action == MotionEvent.ACTION_DOWN) {
                touchPoint = TouchPoint(
                    Point(event.rawX.toInt(), event.rawY.toInt()),
                    Point(event.x.toInt(), event.y.toInt())
                )
            }
            false
        }
    }

    /**
     * Used resources of UI elements must be released here
     */
    @CallSuper
    open fun release() {
        itemView.setOnClickListener(null)
        itemView.setOnTouchListener(null)
    }
}