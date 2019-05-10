package com.shevelev.alpha_emoji_panel.icons_in_lists

import com.shevelev.alpha_emoji_panel.emojies.Emoji

/**
 * Set of relative icons (for example a man with various skin colors)
 */
class ComplexIcon(private val icons: List<IconInGrid>): GroupIconInGrid {
    /**
     *
     */
    override val icon: Emoji
        get() = icons[0].icon

    /**
     *
     */
    override fun getChildIcons(): List<IconInGrid> = icons
}