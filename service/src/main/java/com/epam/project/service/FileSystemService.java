package com.epam.project.service;


import com.epam.project.entity.PathTreeModel;

import java.nio.file.Path;

public interface FileSystemService {
    PathTreeModel getPathTree(Path dir);
}
