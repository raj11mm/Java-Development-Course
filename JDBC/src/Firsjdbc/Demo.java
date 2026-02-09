package Firsjdbc;

import java.sql.*;
import java.util.Scanner;


public class Demo {
    public static void main(String[] args) throws Exception {

        //STEP1: LOAD THE DRIVER
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        //STEP2 : ESTABLISH THE CONNECTION
        Connection con ;
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/raj", "root", "rajshekhar");
        System.out.println("Connection established");

        // STEP 3: CREATE STATEMENT MEDIUM
        Statement stm = con.createStatement();
        System.out.println("Statement medium created");

        //STEP 4 : EXECUTE QUERY
        String sql = "select * from stud";
        ResultSet rs = stm.executeQuery(sql);
        System.out.println("Query executed succesfully");

        // STEP 5: PRINT THE TABLE

        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));
        }

        //STEP 6 : CLOSE THE RESOURCES

        rs.close();
        stm.close();
        con.close();

    }

}
