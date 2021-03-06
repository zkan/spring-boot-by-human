package team.odds.activityservice.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import team.odds.activityservice.models.Activity;
import team.odds.activityservice.services.ActivityService;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ActivityControllerTest {
    @Mock
    private ActivityService activityService;

    @InjectMocks
    private ActivityController activityController;

    @Test
    void testGetActivity() {
//        ActivityService activityService = new ActivityService();
//        ActivityController activityController = new ActivityController(activityService);

        Activity activity1 = new Activity();
        activity1.setName("Login");

        Activity activity2 = new Activity();

        List<Activity> activities = List.of(activity1, activity2);
        Mockito.when(activityService.getAll()).thenReturn(activities);

        List<Activity> actual = activityController.getActivity();

        Assertions.assertEquals(2, actual.size());
        Assertions.assertEquals("Login", actual.get(0).getName());
    }
}
