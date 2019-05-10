package com.shevelev.alpha_emoji_panel.lists.recent

import android.content.Context
import com.shevelev.alpha_emoji_panel.icons_in_lists.IconInGrid
import com.shevelev.alpha_emoji_panel.icons_in_lists.SimpleIcon
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 *
 */
class RecentIconsCollection {
    private var _icons = mutableListOf<IconInGrid>()

    private val maxIconsInList = 25

    private var isLoaded = false
    private var wasUpdated = false

    private val storage = RecentIconsStorage()

    val icons: List<IconInGrid>
    get() = _icons

    /**
     *
     */
    suspend fun load(context: Context) {
        withContext(Dispatchers.IO) {
            if(!isLoaded) {
                _icons = storage.load(context)
                    .map {
                        SimpleIcon(it)
                    }
                    .toMutableList()

                isLoaded = true
            }
        }
    }

    /**
     *
     */
    @Synchronized
    suspend fun save(context: Context) {
        withContext(Dispatchers.IO) {
            if(wasUpdated) {
                val iconsToSave = _icons.map { it.icon }
                storage.save(context, iconsToSave)

                wasUpdated = false
            }
        }
    }

    /**
     * @return true if the list was updated
     */
    @Synchronized
    fun add(icon: IconInGrid): Boolean {
        var iconIndexInList = -1

        for(i in _icons.indices) {
            if(icon.icon == _icons[i].icon) {
                iconIndexInList = i
                break
            }
        }

        if(iconIndexInList == 0) {
            return false
        }

        if(iconIndexInList > 0) {
            _icons.removeAt(iconIndexInList)
        }

        _icons.add(0, icon)

        if(_icons.size > maxIconsInList) {
            _icons.removeAt(_icons.size-1)
        }

        wasUpdated = true
        return true
    }
}