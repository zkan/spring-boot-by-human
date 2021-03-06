package team.odds.activityservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import team.odds.activityservice.models.Activity;
import team.odds.activityservice.services.ActivityService;

import java.util.List;

@RestController
public class ActivityController {

    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

//    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    @GetMapping(value = "/activities")
    public List<Activity> getActivity() {
        return activityService.getAll();
    }

    @GetMapping(value = "/activities/{USER}")
    public List<Activity> getActivityFromUser(@PathVariable("USER") String username) {
        return activityService.getByUser(username);
    }
}
