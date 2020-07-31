package com.example.myapplication

//import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.accessibility.AccessibilityChecks
import androidx.test.espresso.action.ViewActions.click
//import androidx.test.espresso.accessibility.AccessibilityChecks
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.BeforeClass

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    companion object {
        // TODO: must be BeforeClass and not Before (which is incorrectly stated in kotlin samples)
        @BeforeClass
        @JvmStatic
        fun enableAccessibilityChecks() {
            AccessibilityChecks.enable().setRunChecksFromRootView(true)
        }
    }

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.myapplication", appContext.packageName)
    }

    /**
     * Expected to fail w/ 2 a11y errors
     */
    @Test
    fun basicTest() {
        /* TODO:
            using FragmentScenario in place of ActivityScenario will cause test process crash
            and no tests to be found
        */
//        launchFragmentInContainer<BlankFragment>()
        ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.btn)).perform(click())
        onView(withId(R.id.testing)).check(matches(withText("testing")))
    }
}