package team.odds.accountservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import team.odds.accountservice.OddsException;
import team.odds.accountservice.models.AccountRequestModel;
import team.odds.accountservice.models.ActivityResponseModel;
import team.odds.accountservice.services.ActivityService;

import java.util.List;

@RestController
public class AccountController {
    private final ActivityService activityService;

    public AccountController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @PostMapping(value = "/accounts/activities")
    public ResponseEntity<List<ActivityResponseModel>> getAccountActivities(@RequestBody AccountRequestModel account) {
        try {
//        List<ActivityResponseModel> activities = activityService.getActivitiesOf(account);
            List<ActivityResponseModel> activities = activityService.getActivitiesByFeignOf(account);
            return ResponseEntity.ok().body(activities);
        } catch (Exception e) {
            throw new OddsException("999999", "General Error");
        }
    }
}
