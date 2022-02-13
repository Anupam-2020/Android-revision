package com.anupam.testingactivity

import android.content.Context


class ResourceComaparer {

    fun isEqual(context: Context, resId: Int, string: String): Boolean {
        return context.getString(resId) == string
    }
}