package team.odds.activityservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import team.odds.activityservice.models.Activity;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer> {
    @Query("select a from Activity a where a.createdBy=?1")
    List<Activity> findActivitiesByUser(String username);

    List<Activity> findAllByCreatedBy(String username);
}
