package team.odds.activityservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import team.odds.activityservice.models.Activity;

@RestController
public class ActivityController {
//    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    @GetMapping(value = "/activities")
    public Activity getActivity() {
        Activity activity = new Activity();
        activity.setId(1);
        activity.setName("Login");
        activity.setDescription("Kan is logged in");

        return activity;
    }
}
