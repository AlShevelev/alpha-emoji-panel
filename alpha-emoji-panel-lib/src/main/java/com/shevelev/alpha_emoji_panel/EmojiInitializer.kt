package com.shevelev.alpha_emoji_panel

import android.content.Context
import android.util.Log
import androidx.core.provider.FontRequest
import androidx.emoji.text.EmojiCompat
import androidx.emoji.text.FontRequestEmojiCompatConfig

/**
 * Emoji subsystem initialization (fonts loading etc.)
 */
object EmojiInitializer {
    /**
     *
     */
    @Suppress("SpellCheckingInspection")
    fun init(context: Context) {
        val fontRequest = FontRequest(
            "com.google.android.gms.fonts",
            "com.google.android.gms",
            "Noto Color Emoji Compat",
            R.array.com_google_android_gms_fonts_certs
        )

        val config = FontRequestEmojiCompatConfig(context, fontRequest).setReplaceAll(true)

        EmojiCompat.init(config).registerInitCallback(object: EmojiCompat.InitCallback(){
            /**
             *
             */
            override fun onInitialized() {
                Log.d("EMOJI", "initialized")
            }

            /**
             *
             */
            override fun onFailed(throwable: Throwable?) {
                Log.d("EMOJI", "failed: ${throwable?.message}")
            }
        })
    }
}