package Firsjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
       Connection con = null;
       PreparedStatement ps = null;
       Scanner sc = new Scanner(System.in);
       ResultSet res = null;
       String dpath = "com.mysql.cj.jdbc.Driver";
       String url = "jdbc:mysql://127.0.0.1:3306/raj";
       String user = "root";
       String password = "rajshekhar";
       String sql = "select * from stud where id = ?";

       try {
           Class.forName(dpath);
           con = DriverManager.getConnection(url,user,password);
           ps = con.prepareStatement(sql);
           System.out.println("Enter the id to fetch data: ");
           int id = sc.nextInt();
           ps.setInt(1, id);
           res = ps.executeQuery();

           if(res.next()) {
               System.out.print(res.getInt(1) + " " + res.getString(2) + " " + res.getInt(3) + " " + res.getString(4));
           } else {
               System.out.println("Data not found for the given id: " + id);
           }

       } catch(Exception e) {
           e.printStackTrace();
       }
       finally {
           try{
               if(res != null) res.close();
               if(ps != null) ps.close();
               if(con !=  null) con.close();
           } catch (Exception e){
               e.printStackTrace();
           }
       }

    }
}
