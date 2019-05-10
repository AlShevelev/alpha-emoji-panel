package com.shevelev.alpha_emoji_panel.lists

import android.view.ViewGroup
import com.shevelev.alpha_emoji_panel.popup.IconActions

/**
 *
 */
class GridIconsAdapter(private val iconActions: IconActions): IconsAdapterBase<GridIconViewHolder>() {
    /**
     *
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridIconViewHolder =
        GridIconViewHolder(parent.context, parent, iconActions)
}