package com.epam.project.service.impl;


import com.epam.project.entity.PathTreeModel;
import com.epam.project.manager.FileSystemManager;
import com.epam.project.manager.impl.FileSystemManagerImpl;
import com.epam.project.service.FileSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.nio.file.*;

@Service
public class FileSystemServiceImpl implements FileSystemService {

    @Autowired
    private FileSystemManager fileSystemManager;

    @Override
    public PathTreeModel getPathTree(Path dir) {
        return fileSystemManager.getPathTree(dir);
    }
}
