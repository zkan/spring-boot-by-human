package team.odds.accountservice.models;

import lombok.Data;

@Data
public class ActivityResponseModel {
    private Integer id;
    private String name;
    private String description;
    private Long createdAt;
    private String createdBy;
}
