package com.shevelev.alpha_emoji_panel.lists.recent

import android.content.Context
import com.shevelev.alpha_emoji_panel.emojies.Emoji

/**
 * Class for saving and loading recent icons
 */
class RecentIconsStorage {
    private companion object {
        private const val PREFERENCES_NAME = "EMOJI"
        private const val RECENT_KEY = "RECENT_EMOJI"

        private const val ICONS_SPLITTER = ";"
        private const val CODE_POINTS_SPLITTER = "|"
    }

    fun load(context: Context): List<Emoji> =
        try {
            getPreferences(context)
                .getString(RECENT_KEY, "")
                .let {
                    iconsFromString(it!!)
                }
        } catch (ex: Exception) {
            ex.printStackTrace()
            listOf()
        }

    fun save(context: Context, icons: List<Emoji>) =
        try {
            getPreferences(context)
                .edit()
                .putString(RECENT_KEY, iconsToString(icons))
                .apply()
        } catch (ex: Exception) {
            ex.printStackTrace()
        }

    private fun iconsToString(icons: List<Emoji>): String =
        icons.joinToString(ICONS_SPLITTER) { icon ->
            icon.codePoints.joinToString(CODE_POINTS_SPLITTER) { codePoint ->
                codePoint.toString()
            }
        }

    private fun iconsFromString(source: String): List<Emoji> =
        if(source == "") {
            listOf()
        } else {
            source.split(ICONS_SPLITTER)
                .map { iconString ->
                    iconString.split(CODE_POINTS_SPLITTER)
                        .map { codePointString ->
                            codePointString.toInt()
                        }
                }
                .map {
                    Emoji(*it.toIntArray())
                }
        }

    private fun getPreferences(context: Context) = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)
}