package com.company;

public class CheckPhoneNumber {
    public static void main(String[] args) {
        CheckPhoneNumber check = new CheckPhoneNumber();
        try {
            System.out.println(check.checkPhoneNr("267982"));
        }
        catch (InvalidPhoneNumberExeption e){
            System.out.println(e.getMessage());


        }

    }
    public boolean checkPhoneNr(String phoneNoToCheck) throws InvalidPhoneNumberExeption{


        if(phoneNoToCheck.length() < 6 || phoneNoToCheck.length() >12 || phoneNoToCheck.matches(".*\\D.*")){
            throw new InvalidPhoneNumberExeption();

        }
        else{

            return true;

        }
    }
}
