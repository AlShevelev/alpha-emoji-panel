package com.shevelev.alpha_emoji_panel.utils

import android.content.Context
import android.os.Handler
import android.view.View
import android.view.inputmethod.InputMethodManager

/** If we call showSoftInput while the views are being created,
 * there is a good chance that the view won't be active for IMM.
 * This class keeps running every 100 ms until the keyboard has been successfully shown.
 *
 * https://stackoverflow.com/a/43516620
 */
class KeyboardVisibilityRunnable(
    private val context: Context?,
    private val targetView: View?
) : Runnable {

    private val waitInterval = 100L     // ms

    override fun run() {
        if (context == null || targetView == null) {
            return
        }

        // Get Input Method Manager
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        // Check view is focusable
        if (!(targetView.isFocusable && targetView.isFocusableInTouchMode)) {       // Non focusable view
            return
        } else if (!targetView.requestFocus()) {         // Cannot focus on view
            post()
        } else if (!imm.isActive(targetView)) {         // IMM is not active
            post()
        } else if (!imm.showSoftInput(targetView, InputMethodManager.SHOW_FORCED)) { // Unable to show keyboard
            post()
        }
    }

    /**
     * Post this after 100 ms
     */
    private fun post() {
        Handler().postDelayed(this, waitInterval)
    }
}