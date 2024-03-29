package com.aula118.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/client")
public class StudentClientController {

    @Autowired
    StudentClientInterface studentClient;

    @GetMapping("/student")
    public StudentClientResponse getStudentResponse() {

        return studentClient.getStudent();
    }
    
}
