package com.shevelev.alpha_emoji_panel.lists.recent

import android.content.Context
import android.view.ViewGroup
import com.shevelev.alpha_emoji_panel.R
import com.shevelev.alpha_emoji_panel.icons_in_lists.IconInGrid
import com.shevelev.alpha_emoji_panel.lists.IconViewHolderBase
import com.shevelev.alpha_emoji_panel.popup.IconActions
import kotlinx.android.synthetic.main.popup_emoji_recent_item.view.*

/**
 * Holder for one icon in a recent icons list
 */
class RecentIconViewHolder(
    context: Context,
    parentView: ViewGroup,
    iconActions: IconActions
) : IconViewHolderBase(context, parentView, R.layout.popup_emoji_recent_item, iconActions) {

    /**
     * UI elements must be initialized here
     */
    override fun init(item: IconInGrid) {
        super.init(item)
        itemView.emojiIcon.text = item.icon.toEmoji()
    }
}