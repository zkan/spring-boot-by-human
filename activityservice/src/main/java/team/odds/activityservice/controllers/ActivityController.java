package team.odds.activityservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import team.odds.activityservice.models.Activity;
import team.odds.activityservice.services.ActivityService;

import java.util.List;

@RestController
public class ActivityController {

    @Autowired
    private ActivityService activityService;

//    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    @GetMapping(value = "/activities")
    public List<Activity> getActivity() {
        return activityService.getAll();
    }
}
