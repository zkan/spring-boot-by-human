package team.odds.accountservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import team.odds.accountservice.models.AccountRequestModel;
import team.odds.accountservice.models.ActivityResponseModel;
import team.odds.accountservice.services.ActivityService;

import java.util.List;

@RestController
public class AccountController {
    @PostMapping(value = "/accounts/activities")
    public ResponseEntity<List<ActivityResponseModel>> getAccountActivities(@RequestBody AccountRequestModel account) {
        ActivityService activityService = new ActivityService();
        List<ActivityResponseModel> activities = activityService.getActivitiesOf(account);
        return ResponseEntity.ok().body(activities);
    }
}
