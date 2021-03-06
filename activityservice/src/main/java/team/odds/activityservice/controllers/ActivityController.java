package team.odds.activityservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ActivityController {
    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    @ResponseBody
    public String getActivity() {
        return "Hey, Universe!";
    }
}
