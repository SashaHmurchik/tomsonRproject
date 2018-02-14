package com.epam.project.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.nio.file.Path;
import java.util.Set;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PathTreeModel {

//    @JsonProperty(value = "current")
//    private Path currentDir;
//
//    @JsonProperty(value = "previous")
//    private Path previousDir;

    @JsonProperty(value = "current")
    private String currentDir;

    @JsonProperty(value = "previous")
    private String previousDir;

    @JsonProperty(value = "children")
    private Set<PathModel> childrens;
}
