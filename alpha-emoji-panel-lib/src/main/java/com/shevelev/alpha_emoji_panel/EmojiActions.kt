package com.shevelev.alpha_emoji_panel

import android.content.Context
import android.view.KeyEvent
import android.view.View
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatEditText
import com.shevelev.alpha_emoji_panel.popup.EmojiPopupKeyboard
import com.shevelev.alpha_emoji_panel.utils.UIHelper

class EmojiActions
constructor(
    private val context: Context,
    rootView: View,
    private val emojiButton: ImageView,
    private val emojiEditText: AppCompatEditText) {

    private val popup: EmojiPopupKeyboard = EmojiPopupKeyboard(rootView, context)

    private val keyBoardIcon = R.drawable.ic_keyboard
    private val smileyIcons = R.drawable.ic_smile

    fun setUpEmojiKeyboard() {
        //Will automatically set size according to the soft keyboard size
        popup.calculateSize()

        //If the emoji popup is dismissed, change emojiButton to smiley icon
        popup.setOnDismissListener { changeEmojiKeyboardIcon(emojiButton, smileyIcons) }

        //If the text keyboard closes, also dismiss the emoji popup
        popup.setOnSoftKeyboardCloseListener {
            hide()
        }

        //On emoji clicked, add it to editText
        popup.setOnEmojiClickedListener { emoji ->
            val start = emojiEditText.selectionStart
            val end = emojiEditText.selectionEnd

            if (start < 0) {
                emojiEditText.append(emoji.toEmoji())
            } else {
                emojiEditText.text?.let { emojiEditText ->
                    emoji.toEmoji()?.let { emoji ->
                        emojiEditText.replace(
                            Math.min(start, end),
                            Math.max(start, end),
                            emoji,
                            0,
                            emoji.length)
                    }
                }
            }
        }

        // Processing clicks from extra buttons
        popup.setOnKeyClickedListener { keyCode ->
            emojiEditText.dispatchKeyEvent(KeyEvent(0, 0, 0, keyCode, 0, 0, 0, 0, KeyEvent.KEYCODE_ENDCALL))
        }

        // To toggle between text keyboard and emoji keyboard keyboard(Popup)
        showForEditText()
    }

    fun hide() {
        if (popup.isShowing) {
            popup.dismiss()
        }
    }

    fun setOnKeyboardOpenListener(listener: (() -> Unit)?) {
        if(listener == null) {
            popup.setOnOpenListener(listener)
        } else {
            popup.setOnOpenListener {
                emojiEditText.requestFocus()
                listener()
            }
        }
    }

    private fun showForEditText() {
        emojiButton.setOnClickListener {
            //If popup is not showing => emoji keyboard is not visible, we need to show it
            //else, open the text keyboard first and immediately after that show the emoji popup
            if (!popup.isShowing) {

                //If keyboard is visible, simply show the emoji popup
                if (popup.isKeyBoardOpen() || popup.isSizeCalculated()) {
                    popup.showAtBottom()

                    UIHelper.setSoftKeyboardVisibility(context, emojiEditText, false)

                    changeEmojiKeyboardIcon(emojiButton, keyBoardIcon)
                } else {
                    emojiEditText.isFocusableInTouchMode = true
                    emojiEditText.requestFocus()

                    // Show soft keyboard
                    UIHelper.setSoftKeyboardVisibility(context, emojiEditText, true)
                    popup.showAtBottomPending()
                    changeEmojiKeyboardIcon(emojiButton, keyBoardIcon)
                }
            } else {
                //If popup is showing, simply dismiss it to show the underlying text keyboard
                popup.dismiss()
                UIHelper.setSoftKeyboardVisibility(context, emojiEditText, true)
            }
        }
    }

    private fun changeEmojiKeyboardIcon(iconToBeChanged: ImageView, drawableResourceId: Int) =
        iconToBeChanged.setImageResource(drawableResourceId)
}