package com.shevelev.alpha_emoji_panel.emojies

import androidx.emoji.text.EmojiCompat
import com.shevelev.alpha_emoji_panel.utils.MurmurHash
import java.nio.ByteBuffer

/**
 *
 */
class Emoji(vararg val codePoints: Int) {
    companion object {
        private val core = EmojiCompat.get()
    }

    /**
     *
     */
    fun isValid(): Boolean = codePointToChars().isValid()

    /**
     *
     */
    fun toEmoji(): CharSequence? {
        val chars = codePointToChars()
        return if(chars.isValid()) {
            core.process(chars)
        } else {
            null
        }
    }

    /**
     *
     */
    override fun hashCode(): Int =
        if(codePoints.size == 1) {
            codePoints[0]
        } else {
            val codePointsBuffer = ByteBuffer.allocate(codePoints.size * Int.SIZE_BYTES)
            codePoints.forEach {
                codePointsBuffer.putInt(it)
            }

            MurmurHash.hash64(codePointsBuffer.array())
                .let {
                    (it xor it.ushr(32)).toInt()
                }
        }

    /**
     *
     */
    override fun equals(other: Any?): Boolean = other?.let { it === this || it.hashCode() == hashCode() } ?: false

    /**
     *
     */
    private fun codePointToChars(): CharSequence = String(codePoints, 0, codePoints.size)

    /**
     *
     */
    private fun CharSequence.isValid() = core.hasEmojiGlyph(this)
}