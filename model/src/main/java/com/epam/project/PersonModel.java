package com.epam.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PersonModel implements Serializable{

    @JsonProperty(value = "id")
    private Long id;

    @JsonProperty(value = "email")
    private String eMail;

    @JsonProperty(value = "role")
    private RoleModel userRole;
}
