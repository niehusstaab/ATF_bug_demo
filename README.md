# ATF_bug_demo

The [Accessibilty Test Framework (ATF)](https://github.com/google/Accessibility-Test-Framework-for-Android) is not working for me in even the simplest of use cases. 
I'm not sure if the root of the error is some incompatibility between ATF and the FragmentScenario gradle dep, or if there is something fundementally wrong with
the current version of ATF preventing it from working. I would expect it to be able to run with FragmentScenario though anyway, as it is one of the relatively new
testing tools made and recommended by Google (in exesitence since late 2018). The most recent update to ATF was Feb 2020, so this should have been ample time to 
account for any changes.

See `TODO` comments left in the code to mark key areas of interest.

Attempting to run even the most simple of Espresso tests (with FragmentScenario) results in the following error:
```
java.lang.NoSuchMethodError: No virtual method shouldWaitForActivitiesToComplete()Z in class Landroidx/test/runner/AndroidJUnitRunner; or its super classes (declaration of 'androidx.test.runner.AndroidJUnitRunner' appears in /data/app/com.example.myapplication.test-up9qel7XQQdGcgyDX4V36A==/base.apk)
        at androidx.test.runner.AndroidJUnitRunner.addListenersLegacyOrder(AndroidJUnitRunner.java:442)
        at androidx.test.runner.AndroidJUnitRunner.addListeners(AndroidJUnitRunner.java:423)
        at androidx.test.runner.AndroidJUnitRunner.onStart(AndroidJUnitRunner.java:391)
        at android.app.Instrumentation$InstrumentationThread.run(Instrumentation.java:2189)
```
