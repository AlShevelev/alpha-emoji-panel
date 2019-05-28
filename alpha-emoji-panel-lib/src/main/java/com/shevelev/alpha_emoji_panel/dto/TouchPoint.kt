package com.shevelev.alpha_emoji_panel.dto

import android.graphics.Point

data class TouchPoint (
    val absolute: Point,
    val inView: Point
)