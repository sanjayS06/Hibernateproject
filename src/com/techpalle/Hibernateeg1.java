package com.techpalle;

import org.hibernate.cfg.Configuration;

import com.techpalle.model.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Hibernateeg1 {

	public static void main(String[] args) {
	  //code for inserting 2 rows into Employee tables
      SessionFactory factory=new Configuration().configure().buildSessionFactory();
	  Session session=factory.openSession();
	  Transaction t=session.beginTransaction();
	  Employee e1=new Employee(1,"ramesh",40000);
	  Employee e2=new Employee(2,"suresh",50000);
	  session.save(e1);
	  session.save(e2);
	  t.commit();
	  session.close();
	  factory.close();
	  
 //code for delete a rows into Employee tables
//    SessionFactory factory=new Configuration().configure().buildSessionFactory();
//	  Session session=factory.openSession();
//	  Transaction t=session.beginTransaction();
//	  Employee e1=session.get(Employee.class, 2);
//	 
//	  session.delete(e1);
//	  t.commit();
//	 
//	  session.close();
//	  factory.close();
//	  
	  
	  
	//code for reading a rows into Employee tables
//	  SessionFactory factory=new Configuration().configure().buildSessionFactory();
//	  Session session=factory.openSession();
//	  Employee e1=session.get(Employee.class, 1);
//	  System.out.println(e1.getEno());
//	  
//	  System.out.println(e1.getEname());
//	  System.out.println(e1.getEsal());
//	
//	
//	  session.close();
//	  factory.close();
	  
	  
//	 
//	         //code for updating  a rows
//	          SessionFactory factory = new Configuration().configure().buildSessionFactory();          
//	          Session session = factory.openSession();
//	          Transaction t = session.beginTransaction();
//	          
//	          Employee e1 = session.get(Employee.class, 1);
//	          if (e1 != null) {           
//	              e1.setName("Ramesh Kumar");
//	              e1.setSalary(45000);
//	              session.update(e1);
//	          } else {
//	              System.out.println("Employee with ID 1 not found.");
//	          }
//	          Employee e2 = session.get(Employee.class, 2);
//	          if (e2 != null) {
//	              e2.setName("Suresh Kumar");
//	              e2.setSalary(55000);
//                 session.update(e2);
//	          } else {
//	              System.out.println("Employee with ID 2 not found.");
//	          }
//
//	          t.commit();
//            session.close();
//	          factory.close();
//	      
	  }

	  
	  

}

		
		
		

