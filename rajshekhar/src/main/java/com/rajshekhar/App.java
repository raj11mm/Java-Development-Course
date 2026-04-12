package com.rajshekhar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Connection con = null;
        PreparedStatement ps = null;
        String dpath = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/raj?user = root & password = rajshekhar";
        String sql = "insert into department value (?,?,?,?)";

        try {
            Class.forName(dpath);
            con = DriverManager.getConnection(url);
            ps = con.prepareStatement(sql);

            raj : while(true) {
                System.out.println("Enter 1 to insert and 2 to exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter id, name, loc, nemp");
                        int id = sc.nextInt();
                        String name = sc.next();
                        String loc = sc.next();
                        int nemp = sc.nextInt();
                        ps.setInt(1, id);
                        ps.setString(2, name);
                        ps.setString(3, loc);
                        ps.setInt(4, nemp);

                        ps.addBatch();
                        break;

                    case 2: break raj;
                }
            }

            int[] res = ps.executeBatch();
            for(int i : res) {
                System.out.println(i + " ");
            }
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
