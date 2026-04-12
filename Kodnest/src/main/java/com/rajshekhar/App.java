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
        System.out.println("Enter streetno, streetname, city, state, country, pincode");
        Address addr = new Address(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());

        System.out.println("Enter name, marks, age");
        Student stud = new Student(sc.next(), sc.nextInt(), sc.nextInt(),addr );

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(addr);
        session.persist(stud);

        transaction.commit();
        factory.close();
        session.close();

    }
}
