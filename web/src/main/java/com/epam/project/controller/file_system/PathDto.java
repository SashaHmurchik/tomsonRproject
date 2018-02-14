package com.epam.project.controller.file_system;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PathDto {

    @JsonProperty(value = "path")
    private String path;

}
