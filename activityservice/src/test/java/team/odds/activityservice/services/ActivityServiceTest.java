package team.odds.activityservice.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import team.odds.activityservice.models.Activity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityServiceTest {
    @Test
    void testGetAll() {
        ActivityService activityService = new ActivityService();
        List<Activity> actual = activityService.getAll();
        Assertions.assertEquals(2, actual.size());
        Assertions.assertEquals(1, actual.get(0).getId());
        Assertions.assertEquals("Login", actual.get(0).getName());
        Assertions.assertEquals("Kan is logged in", actual.get(0).getDescription());
        Assertions.assertEquals(2, actual.get(1).getId());
        Assertions.assertEquals("Logout", actual.get(1).getName());
        Assertions.assertEquals("Kan is logged out", actual.get(1).getDescription());
    }
}