package com.shevelev.alpha_emoji_panel.popup

import com.shevelev.alpha_emoji_panel.dto.TouchPoint
import com.shevelev.alpha_emoji_panel.icons_in_lists.IconInGrid

/**
 * Actions from icons
 */
interface IconActions {
    /**
     *
     */
    fun onIconClick(icon: IconInGrid, touchPoint: TouchPoint)
}