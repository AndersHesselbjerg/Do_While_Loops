package com.company;

public class InvalidPhoneNumberExeption extends Exception {

    public InvalidPhoneNumberExeption(){
        super("Wrong phone number");


    }

    public static void main(String[] args) {
        Exception ex = new Exception("besked til execption");
    }

}
