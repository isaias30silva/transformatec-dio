package com.aula118.server2;

public class Classroom {

    private Integer id;
    private String teacher;

    Classroom(Integer id, String teacher) {
        this.id = id;
        this.teacher = teacher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}