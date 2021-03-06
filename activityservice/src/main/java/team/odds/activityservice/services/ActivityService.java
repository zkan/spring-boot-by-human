package team.odds.activityservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
//        1: @Query
//        return activityRepository.findActivitiesByUser(username);
//        2: JPQL
//        return activityRepository.findAllByCreatedBy(username);
//        3: Example
        Activity activity = Activity.builder()
                .createdBy(username)
                .build();
        Example<Activity> example = Example.of(activity);
        return activityRepository.findAll(example);
    }
}
