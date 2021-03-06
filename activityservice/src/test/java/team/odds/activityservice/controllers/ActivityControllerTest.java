package team.odds.activityservice.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import team.odds.activityservice.models.Activity;
import team.odds.activityservice.services.ActivityService;

import java.util.List;

public class ActivityControllerTest {
    @Test
    void testGetActivity() {
        ActivityService activityService = new ActivityService();
        ActivityController activityController = new ActivityController(activityService);
        List<Activity> actual = activityController.getActivity();
        Assertions.assertEquals(2, actual.size());
        Assertions.assertEquals("Login", actual.get(0).getName());
    }
}
