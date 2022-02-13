package com.anupam.testingactivity

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {

//    private val resourceComaparer = ResourceComaparer()

    private lateinit var resourceComaparer : ResourceComaparer

    @Before
    fun setUp() {
        resourceComaparer = ResourceComaparer()
    }



    @Test
    fun string_resource_same_as_given_string_returns_true() {
//        resourceComaparer = ResourceComaparer()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComaparer.isEqual(context, R.string.app_name,"TestingActivity")
        Truth.assertThat(result).isTrue()
    }

    @Test
    fun string_resource_different_as_given_string_returns_false() {
//        resourceComaparer = ResourceComaparer()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComaparer.isEqual(context, R.string.app_name,"hello")
        Truth.assertThat(result).isFalse()
    }
}