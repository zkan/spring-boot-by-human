package team.odds.activityservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.odds.activityservice.models.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer> {

}
