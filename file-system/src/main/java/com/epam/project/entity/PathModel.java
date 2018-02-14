package com.epam.project.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.nio.file.Path;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PathModel {

//    @JsonProperty(value = "path")
//    private Path path;

    @JsonProperty(value = "path")
    private String path;

    @JsonProperty(value = "folder")
    private boolean folder;

}
