package com.rajshekhar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
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
        System.out.println("Enter name, gender, salary");

        Employee emp = new Employee(sc.next(), sc.next(), sc.nextInt());

        Configuration config = new Configuration().configure();

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(emp);
        transaction.commit();

        session.close();


    }
}
