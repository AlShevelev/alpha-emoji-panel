package com.shevelev.alpha_emoji_panel.lists.recent

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import com.shevelev.alpha_emoji_panel.icons_in_lists.IconInGrid
import com.shevelev.alpha_emoji_panel.lists.IconsAdapterBase
import com.shevelev.alpha_emoji_panel.popup.IconActions

/**
 *
 */
class RecentIconsAdapter(private val iconActions: IconActions): IconsAdapterBase<RecentIconViewHolder>() {
    /**
     *
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentIconViewHolder =
        RecentIconViewHolder(parent.context, parent, iconActions)

    /**
     *
     */
    override fun updateData(data: List<IconInGrid>) {
        val newItems = data.filter { it.icon.isValid() }

        val diffCallback = EmojiDiffAlg(items, newItems)
        val diffResult = DiffUtil.calculateDiff(diffCallback)

        items = newItems
        diffResult.dispatchUpdatesTo(this)
    }
}