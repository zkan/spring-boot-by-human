package team.odds.activityservice.services;

import org.springframework.stereotype.Service;
import team.odds.activityservice.models.Activity;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityService {
    public List<Activity> getAll() {
        Activity activity1 = Activity.builder()
                .id(1)
                .name("Login")
                .description("Kan is logged in")
                .build();
        Activity activity2 = Activity.builder()
                .id(2)
                .name("Logout")
                .description("Kan is logged out")
                .build();

        List<Activity> activities = new ArrayList<>();
        activities.add(activity1);
        activities.add(activity2);

        return activities;
    }
}
