package team.odds.accountservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import team.odds.accountservice.models.ActivityResponseModel;

import java.util.List;

@FeignClient(name = "activity-service", url = "http://localhost:8000")
public interface ActivityServiceClient {
    @GetMapping(value = "/activities/{USER}")
    List<ActivityResponseModel> getActivityFromUser(@PathVariable("USER") String username);
}
