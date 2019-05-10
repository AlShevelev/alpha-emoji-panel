package com.shevelev.alpha_emoji_panel.utils

import android.content.Context
import android.util.DisplayMetrics
import android.util.Size
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import androidx.annotation.DimenRes

object UIHelper {
    /**
     * Returns size of the screen without system buttons (home etc.) panel
     */
    fun getScreenSize(context: Context): Size {
        val metrics = DisplayMetrics()

        val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        windowManager.defaultDisplay.getMetrics(metrics)

        return Size(metrics.widthPixels, metrics.heightPixels)
    }

    /**
     * Returns full size of the screen
     */
    fun getRealScreenSize(context: Context): Size {
        val metrics = DisplayMetrics()

        val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        windowManager.defaultDisplay.getRealMetrics(metrics)

        return Size(metrics.widthPixels, metrics.heightPixels)
    }

    /**
     *
     */
    fun getScreenOrientation(context: Context): ScreenOrientation =
        getScreenSize(context)
            .let { size ->
                if(size.width > size.height) ScreenOrientation.LANDSCAPE else ScreenOrientation.PORTRAIT
            }

    /**
     *
     */
    fun setSoftKeyboardVisibility(context: Context, someViewInWindow: View, isVisible: Boolean) {
        if (isVisible) {
            someViewInWindow.post(KeyboardVisibilityRunnable(context, someViewInWindow))
        } else {
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(someViewInWindow.windowToken, 0)
        }
    }

    /**
     * Get dimension value in pixels
     */
    fun getDimension(context: Context, @DimenRes resId: Int): Int = context.resources.getDimension(resId).toInt()
}