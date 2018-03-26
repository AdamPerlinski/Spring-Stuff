package com.company;

import java.util.ArrayList;
import java.util.List;

public class Faculty implements EmailReciepient {
    private List<String> faculties = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    public Faculty(){

    }

    public List<String> getFaculties() {
        return faculties;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setFaculties(List<String> faculties) {
        this.faculties = faculties;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String getEmailAddress() {
        return null;
    }
}
