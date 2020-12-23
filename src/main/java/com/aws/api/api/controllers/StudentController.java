package com.aws.api.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @GetMapping
    public String[] get() {
        return new String[]{"Student 1 ", "Student 2"};
    }
}
