package com.epam.project.controller.file_system;

import com.epam.project.entity.PathTreeModel;
import com.epam.project.service.FileSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import java.nio.file.Paths;

@Controller
@RestController
@Consumes("application/json")
@Produces("application/json")
@RequestMapping(value = "/file")
public class FileSystemController {

    @Autowired
    private FileSystemService fileSystemService;

    @ResponseStatus(value = HttpStatus.OK)
    @PostMapping(value = "/get")
    public PathTreeModel findByPath(@RequestBody PathDto pathDto) {
        return fileSystemService.getPathTree(Paths.get(pathDto.getPath()));
    }
}
