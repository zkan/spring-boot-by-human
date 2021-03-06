package team.odds.activityservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import team.odds.activityservice.models.Activity;
import team.odds.activityservice.services.ActivityService;

import java.util.List;

@RestController
public class ActivityController {
//    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    @GetMapping(value = "/activities")
    public List<Activity> getActivity() {
        ActivityService activityService = new ActivityService();
        return activityService.getAll();
    }
}
