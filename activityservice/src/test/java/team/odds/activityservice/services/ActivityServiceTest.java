package team.odds.activityservice.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.AbstractCharInputReader;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import team.odds.activityservice.models.Activity;
import team.odds.activityservice.repositories.ActivityRepository;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class ActivityServiceTest {
    @Mock
    ActivityRepository activityRepository;

    @InjectMocks
    ActivityService activityService;

    @Test
    void testGetAll() {
        Activity activity1 = new Activity();
        activity1.setId(1);
        activity1.setName("Login");
        activity1.setDescription("Kan is logged in");

        Activity activity2 = new Activity();
        activity2.setId(2);
        activity2.setName("Logout");
        activity2.setDescription("Kan is logged out");

        List<Activity> activities = List.of(activity1, activity2);
        Mockito.when(activityRepository.findAll()).thenReturn(activities);

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