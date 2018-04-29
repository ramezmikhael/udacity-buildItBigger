package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by RamezReda on 4/28/2018.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityFreeTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityIntentsTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void adExistsTest() {
        onView(withId(R.id.adView)).check(matches(isDisplayed()));
    }
}