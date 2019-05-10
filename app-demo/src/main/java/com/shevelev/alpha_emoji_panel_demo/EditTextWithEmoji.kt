package com.shevelev.alpha_emoji_panel_demo

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.shevelev.alpha_emoji_panel.EmojiActions
import kotlinx.android.synthetic.main.widget_edittext_with_button.view.*

class EditTextWithEmoji
@JvmOverloads
constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    init {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        @Suppress("LeakingThis")
        inflater.inflate(R.layout.widget_edittext_with_button, this)

        val emojiIcon = EmojiActions(context, rootView, smileIcon, nameTextField)
        emojiIcon.setUpEmojiKeyboard()
    }
}