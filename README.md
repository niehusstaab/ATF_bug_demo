# ATF_bug_demo

The [Accessibilty Test Framework (ATF)](https://github.com/google/Accessibility-Test-Framework-for-Android) is not working for me in even the simplest of use cases with FragmentScenario. I'm not sure if the root of the error is in FragmentScenario or ATF. The mere inclusion of both gradle deps for FragmentScenario and ATF is enough to cause this problem, whether or not any code from either dep is called/imported.

See `TODO` comments left in the code that mark key areas of interest.

Attempting to run even the most simple of Espresso tests with FragmentScenario results in no tests being found and the following error in the logs:
```
java.lang.NoSuchMethodError: No virtual method shouldWaitForActivitiesToComplete()Z in class Landroidx/test/runner/AndroidJUnitRunner; or its super classes (declaration of 'androidx.test.runner.AndroidJUnitRunner' appears in /data/app/com.example.myapplication.test-up9qel7XQQdGcgyDX4V36A==/base.apk)
        at androidx.test.runner.AndroidJUnitRunner.addListenersLegacyOrder(AndroidJUnitRunner.java:442)
        at androidx.test.runner.AndroidJUnitRunner.addListeners(AndroidJUnitRunner.java:423)
        at androidx.test.runner.AndroidJUnitRunner.onStart(AndroidJUnitRunner.java:391)
        at android.app.Instrumentation$InstrumentationThread.run(Instrumentation.java:2189)
```
