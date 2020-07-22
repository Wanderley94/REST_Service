package com.denisk.web_services.Controllers;

import com.denisk.web_services.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sort_string")
public class ControllerSortString {

    private final PostService postService;

    @Autowired
    public ControllerSortString(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public String[] sortLine(@RequestBody List<String> listString) {
        return postService.sortString(listString);
    }

}
