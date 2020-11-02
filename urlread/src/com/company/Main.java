package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    String url = "https://www.dr.dk/";
    URLReader uread = new URLReader();
    ArrayList<String> lst = uread.readUrl(url);


        System.out.println("Læs lst=" + lst.size());


        JDBCWriter jw = new JDBCWriter();
        boolean gotcon = jw.setConnection();
        System.out.println("Got connection" + gotcon);



        }

    }
}
