package com.company;

public class Teacher  extends Person{
    private  String courseName;
    public Teacher(String fn, String ln,String cn,String ea) {
        super(fn, ln, ea);
        this.courseName = cn;
    }
    public void setCourseName(String cn){
        this.courseName = cn;
    }
    public String getCourseName(){
        return this.courseName;
    }


}
