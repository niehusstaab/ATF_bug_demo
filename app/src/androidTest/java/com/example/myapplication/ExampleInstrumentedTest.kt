package com.example.myapplication

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
//import androidx.test.espresso.accessibility.AccessibilityChecks
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    /* TODO:
    Attempting to run tests (w/ or w/o the commented code/imports) results in following error in logcat

    2020-07-28 16:53:24.831 21819-21850/com.example.myapplication E/AndroidRuntime: FATAL EXCEPTION: Instr: androidx.test.runner.AndroidJUnitRunner
    Process: com.example.myapplication, PID: 21819
    java.lang.NoSuchMethodError: No virtual method shouldWaitForActivitiesToComplete()Z in class Landroidx/test/runner/AndroidJUnitRunner; or its super classes (declaration of 'androidx.test.runner.AndroidJUnitRunner' appears in /data/app/com.example.myapplication.test-up9qel7XQQdGcgyDX4V36A==/base.apk)
        at androidx.test.runner.AndroidJUnitRunner.addListenersLegacyOrder(AndroidJUnitRunner.java:442)
        at androidx.test.runner.AndroidJUnitRunner.addListeners(AndroidJUnitRunner.java:423)
        at androidx.test.runner.AndroidJUnitRunner.onStart(AndroidJUnitRunner.java:391)
        at android.app.Instrumentation$InstrumentationThread.run(Instrumentation.java:2189)
     */

//    companion object {
//        @Before
//        @JvmStatic
//        fun enableAccessibilityChecks() {
//            AccessibilityChecks.enable()
//        }
//    }

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.myapplication", appContext.packageName)
    }

    @Test
    fun basicTest() {
        launchFragmentInContainer<BlankFragment>()

        onView(withId(R.id.testing)).check(matches(withText("testing")))
    }
}