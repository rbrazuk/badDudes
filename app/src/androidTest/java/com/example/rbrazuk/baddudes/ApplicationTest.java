package com.example.rbrazuk.baddudes;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.app.Application;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.LargeTest;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */

/*
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }
}
*/


@RunWith(AndroidJUnit4.class)
@LargeTest
public class ApplicationTest {

    public static final String TEST_MESSAGE = "Let's go for a burger...HA! HA! HA!";


    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void clickButton() {
        // Tap button
        onView(withId(R.id.badButton)).perform(click());

        // Check that text changes after button was tapped
        onView(withId(R.id.messageLabel)).check(matches(withText(TEST_MESSAGE)));
    }



}
