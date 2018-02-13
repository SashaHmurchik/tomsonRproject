package com.epam.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class RoleModel {

    @JsonProperty(value = "role_id")
    private Long id;

    @JsonProperty(value = "role_name")
    private String roleName;

}
