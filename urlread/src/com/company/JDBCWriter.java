package com.company;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCWriter {


    private Connection connection = null;

    public boolean setConnection() {
        final String url = "jdbc:mysql://localhost:3306/urlread?serverTimezone=UTC";
        boolean bres = false;
        try{
            connection = DriverManager.getConnection(url, "Anders", "x");
            bres = true;

        }   catch(SQLException ioerr) {
            System.out.println("Vi fik ikke connection=" + ioerr.getMessage());

        }


        return bres;

    }


}
