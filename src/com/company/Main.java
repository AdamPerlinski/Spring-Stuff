package com.company;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Bill", "Gates", "gomes2@o2.pl");
        Person p2 = new Person("Gal", "Anonim", "fksjii@gmail.com");

        System.out.println(p1);
        System.out.println(p2);

        University zut = new University("Zachodniopomorski Uniwersystet Technologiczny w Szczecinie", "zut@zut.edu.pl");
        University wsks = new University("Wyższa Szkoła Kosmetologii Stosowanej w Koluszkach", "wsks@wsks.edu.pl");

        Person s1 = new Student("Jan", "Kowalski", "jkowalski@wi.zut.edu.pl", "32A");
        Person s2 = new Student("Hermenegilda", "Nowak", "henowak@wi.zut.edu.pl", "32A");
        Person t1 = new Teacher("Bjarne", "Stroustrup", "bjarne@fake.org", "Introduction to C++");

        EmailReciepient[] spamList = new EmailReciepient[5];
        spamList[0] = zut;
        spamList[1] = wsks;
        spamList[2] = s1;
        spamList[3] = s2;
        spamList[4] = t1;

        for (EmailReciepient recipient : spamList) {
            String email = recipient.getEmailAddress();
            System.out.println(email);
        }

        Student[] groupA = new Student[2];
        groupA[0] = new Student("Adam", "Perliński", "A1", "fox@zut.edu.pl");
        groupA[1] = new Student("Andrzej", "Binarny", "A2", "Binarny@andrzeje.zut.edu.pl");

        groupA[0].addGrade(3.0);
        groupA[0].addGrade(4.5);
        groupA[0].addGrade(5.0);
        groupA[1].addGrade(3.0);
        groupA[1].addGrade(2.0);
        groupA[1].addGrade(2.0);
        for (Student students : groupA) {
            Double grade = students.getGradesAverage();
            System.out.println(grade);
        }




    }
}
