package com.learn.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learn.model.Assignment;

@RestController
@RequestMapping("/assignments")
public class AssignmentController {

    @RequestMapping(method = RequestMethod.POST)
    public Assignment createAssignment(@RequestBody final Assignment assignment) {

        return assignment;
    }
}