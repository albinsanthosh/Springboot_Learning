package com.luv2code.hibernate.demo;

import java.text.ParseException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// create a student object
			System.out.println("Creating a new student object...");
			
			String theDateOfBirthStr = "31/12/1998";
            Date theDateOfBirth = null;
			try {
				theDateOfBirth = DateUtils.parseDate(theDateOfBirthStr);
			} catch (ParseException e) {
				e.printStackTrace();
			}
            
            Student tempStudent = new Student("Pauly", "Doe", theDateOfBirth,"paul@luv.com");
			
			// Student tempStudent = new Student("Mary", "Walker", "mary@luv2code.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the student...");
			session.save(tempStudent);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}