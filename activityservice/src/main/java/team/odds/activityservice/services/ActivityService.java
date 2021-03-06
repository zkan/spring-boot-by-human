package team.odds.activityservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.odds.activityservice.models.Activity;
import team.odds.activityservice.repositories.ActivityRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityService {
    private final ActivityRepository activityRepository;

    public ActivityService(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    public List<Activity> getAll() {
//        Activity activity1 = Activity.builder()
//                .id(1)
//                .name("Login")
//                .description("Kan is logged in")
//                .build();
//        Activity activity2 = Activity.builder()
//                .id(2)
//                .name("Logout")
//                .description("Kan is logged out")
//                .build();
//
//        List<Activity> activities = new ArrayList<>();
//        activities.add(activity1);
//        activities.add(activity2);

        return activityRepository.findAll();
    }

    public List<Activity> getByUser(String username) {
//        return activityRepository.findActivitiesByUser(username);
        return activityRepository.findAllByCreatedBy(username);
    }
}
