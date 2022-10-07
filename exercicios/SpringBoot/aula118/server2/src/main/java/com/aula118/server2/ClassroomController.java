package com.aula118.server2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClassroomController {
    
    private static Classroom classRoom = new Classroom(1, "Maria");

    @GetMapping("/classroom")
    public ClassroomResponse getClassroom() {
        return ClassroomResponse.builder().id(classRoom.getId()).teacher(classRoom.getTeacher()).build();
    }
}
