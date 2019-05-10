package com.shevelev.alpha_emoji_panel.lists

import android.view.ViewGroup
import com.shevelev.alpha_emoji_panel.popup.IconActions

/**
 *
 */
class ComplexIconsAdapter(private val iconActions: IconActions): IconsAdapterBase<ComplexIconViewHolder>() {
    /**
     *
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComplexIconViewHolder =
        ComplexIconViewHolder(parent.context, parent, iconActions)
}