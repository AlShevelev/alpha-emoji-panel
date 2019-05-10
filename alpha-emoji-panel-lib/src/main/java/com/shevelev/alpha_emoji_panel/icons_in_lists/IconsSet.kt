package com.shevelev.alpha_emoji_panel.icons_in_lists

import com.shevelev.alpha_emoji_panel.emojies.Emoji

/**
 * A set of icons
 */
class IconsSet(
    override val icon: Emoji,
    private val icons: List<IconInGrid>
) : GroupIconInGrid {

    /**
     *
     */
    override fun getChildIcons(): List<IconInGrid> = icons
}