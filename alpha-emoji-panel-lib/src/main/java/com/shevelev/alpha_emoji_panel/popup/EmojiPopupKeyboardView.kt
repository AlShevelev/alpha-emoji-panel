package com.shevelev.alpha_emoji_panel.popup

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.shevelev.alpha_emoji_panel.R
import kotlinx.android.synthetic.main.popup_emoji.view.*

/**
 * Custom view for [EmojiPopupKeyboard]
 */
class EmojiPopupKeyboardView
@JvmOverloads
constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    val generalListView: RecyclerView
    get() = generalList

    val recentListView: RecyclerView
    get() = recentList

    /**
     *
     */
    init {
        inflate(context, R.layout.popup_emoji, this)
    }

    /**
     *
     */
    fun setOnClickListenerHomeButton(listener: OnClickListener?) = homeButton.setOnClickListener(listener)

    /**
     *
     */
    fun setOnClickListenerBackButton(listener: OnClickListener?) = backButton.setOnClickListener(listener)

    /**
     *
     */
    fun setOnClickListenerSpaceButton(listener: OnClickListener?) = spaceButton.setOnClickListener(listener)

    /**
     *
     */
    fun setHomeButtonVisibility(isVisible: Boolean) {
        homeButton.visibility = if (isVisible) View.VISIBLE else View.GONE
    }
}
