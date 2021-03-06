package team.odds.activityservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import team.odds.activityservice.models.Activity;

@RestController
public class ActivityController {
//    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    @GetMapping(value = "/activities")
    public Activity getActivity() {
        return Activity.builder()
                .id(1)
                .name("Login")
                .description("Kan is logged in")
                .build();
    }
}
