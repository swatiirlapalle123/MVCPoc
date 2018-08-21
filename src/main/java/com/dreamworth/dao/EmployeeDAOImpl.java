package com.dreamworth.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.dreamworth.entity.Employee;
import com.dreamworth.util.HibernateUtil;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private SessionFactory factory;

	@Override
	public String saveEmployee(Employee employee) {
		factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		session.save(employee);
		Transaction tx=session.beginTransaction();
		session.close();
		factory.close();
		return "Registration Successful";
	}

}
