package com.epam.project.manager;


import com.epam.project.entity.PathTreeModel;

import java.nio.file.Path;

public interface FileSystemManager {
    PathTreeModel getPathTree(Path path);
}
