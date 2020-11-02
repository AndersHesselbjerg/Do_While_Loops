package com.example.demo;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private String cpr;

    public Student(){



    }
    public Student(int studentId, String firstName, String lastName, String cpr) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpr = cpr;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCpr() {
        return cpr;
    }

    public int getStudentId() {
        return studentId;


    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;


    }
}
