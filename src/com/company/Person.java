package com.company;

public class Person  implements EmailReciepient {

    private String firstName;
    private String lastName;
    private String emailAdress;
    @Override
    public  String getEmailAddress(){
        return emailAdress;
    }
    public Person(String fn, String ln,String ea) {
        this.firstName = fn;
        this.lastName = ln;
        this.emailAdress = ea;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}