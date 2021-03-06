package team.odds.accountservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import team.odds.accountservice.clients.ActivityServiceClient;
import team.odds.accountservice.models.AccountRequestModel;
import team.odds.accountservice.models.ActivityResponseModel;

import java.util.List;

@Service
public class ActivityService {
    private final ActivityServiceClient activityServiceClient;

    public ActivityService(ActivityServiceClient activityServiceClient) {
        this.activityServiceClient = activityServiceClient;
    }

    public List<ActivityResponseModel> getActivitiesOf(AccountRequestModel account) {
        String activityUrl = "http://localhost:8000/activities/" + account.getUsername();
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<ActivityResponseModel>> response = restTemplate.exchange(
                activityUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {});
        return response.getBody();
    }

    public List<ActivityResponseModel> getActivitiesByFeignOf(AccountRequestModel account) {
        return activityServiceClient.getActivityFromUser(account.getUsername());
    }
}
