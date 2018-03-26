package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Double> grades = new ArrayList<>();
    private String groupId;
        public Student(String fn,String ln,String gId, String ea){
             super(fn,ln,ea);
             this.groupId = gId;
        }
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    public List<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }


    public Double getGradesAverage() {
        Double sum = 0.0;
        if(!grades.isEmpty()) {
            for (Double mark : grades) {
                sum += mark;
            }
            return sum.doubleValue() / grades.size();
        }
        return sum;
    }
    }

