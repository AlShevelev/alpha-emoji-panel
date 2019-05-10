package com.shevelev.alpha_emoji_panel_demo

import android.app.Application
import com.shevelev.alpha_emoji_panel.EmojiInitializer

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        EmojiInitializer.init(this)
    }
}