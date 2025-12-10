package com.kodnest.ThirdHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	SessionFactory factory = new Configuration()
    	        .configure()
    	        .addAnnotatedClass(Student.class)
    	        .buildSessionFactory();

        
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        // Check whether data is there or not
        
        System.out.println("Enter the id of student to be deleted:");
        int id = scan.nextInt();
        Student obj = session.get(Student.class, id);

        
        if(obj != null) {
        	session.remove(obj);
        	System.out.println("Student deleted successfully");
        } else {
        	System.out.println("Student doesnt exist");
        }
        
        transaction.commit();
        session.close();
        factory.close();
    }
}
