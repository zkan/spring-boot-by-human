package team.odds.activityservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import team.odds.activityservice.models.Activity;

@Controller
public class ActivityController {
    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    @ResponseBody
    public Activity getActivity() {
        Activity activity = new Activity();
        activity.setId(1);
        activity.setName("Login");
        activity.setDescription("Kan is logged in");

        return activity;
    }
}
