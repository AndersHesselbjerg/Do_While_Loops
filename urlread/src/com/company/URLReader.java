package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class URLReader {


    public ArrayList<String> readURL(String aURL) {
        ArrayList<String> lst = new ArrayList<>();
        try{
            URL url = new URL(aURL);
            try{

                InputStreamReader inread = new InputStreamReader(url.openStream());
                BufferedReader bufr = new BufferedReader(inread);
                String line = bufr.readLine();
                while(line != null) {
                    lst.add(line);
                    line = bufr.readLine();

                }


            }

            catch (IOException ioerr) {
                System.out.println("Fejl i Read=" + ioerr.getMessage());


            }


        }
        catch (MalformedURLException malerr) {
            System.out.println("Fejl i URL=" );

        }


    }
}
