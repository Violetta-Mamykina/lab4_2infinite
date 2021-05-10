package com.example.lab4_2


import android.content.pm.ActivityInfo
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import com.example.lab4_2.CustomMatchers.Companion.withItemCount
import com.example.lab4_2.CustomMatchers.Companion.withItemCountSecond
import org.junit.Rule


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class RecyclerViewTest {
    val itemsCount = 96
    @get:Rule
    val rule = activityScenarioRule<MainActivity>()

    @Test
    fun countItems() {
        Espresso.onView(withId(R.id.list))
            .check(matches(withItemCountSecond(itemsCount)))
}
}
