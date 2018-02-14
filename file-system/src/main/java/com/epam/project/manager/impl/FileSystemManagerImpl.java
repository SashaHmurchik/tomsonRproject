package com.epam.project.manager.impl;

import com.epam.project.entity.PathModel;
import com.epam.project.entity.PathTreeModel;
import com.epam.project.manager.FileSystemManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.*;
import java.util.HashSet;
import java.util.Set;

@Service
public class FileSystemManagerImpl implements FileSystemManager {

    private static final Path MAIN_ROOT = Paths.get("D://ecl//ROOT");

    @Override
    public PathTreeModel getPathTree(Path dir) {
        if (dir == null) {
            dir = MAIN_ROOT;
        }
        PathTreeModel pathTreeModel = new PathTreeModel();
        pathTreeModel.setCurrentDir(dir.toString());
        if(dir.getParent() != null) {
            pathTreeModel.setPreviousDir(dir.getParent().toString());
        }

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            Set<PathModel> pathModels = new HashSet<>();
            for (Path path: stream) {
                PathModel pathModel = new PathModel(path.toString(), Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS));
                pathModels.add(pathModel);
            }
            pathTreeModel.setChildrens(pathModels);
        } catch (IOException | DirectoryIteratorException x) {
            // IOException не может броситься во время итерации.
            // В этом куске кода оно может броситься только
            // методом newDirectoryStream.
            System.err.println(x);
        }
        return pathTreeModel;
    }
}
