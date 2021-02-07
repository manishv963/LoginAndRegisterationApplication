package com.mrv.technology.ambrack.medical.stock.MediacalStockApplication.UserRegisteration;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Service;

import com.mrv.technology.ambrack.medical.stock.MediacalStockApplication.Login.Login;

import org.hibernate.SQLQuery;


@Service("registerationService")
public class RegisterationModelImpl implements RegisterationInterface {
	private SessionFactory sf;
	
	public RegisterationModelImpl() {
		Configuration config = new Configuration().configure("hibernate.xml").addAnnotatedClass(Login.class);
        config.addAnnotatedClass(Registeration.class);


	     org.hibernate.service.ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
	      sf = config.buildSessionFactory(reg);
	}
	public String  registerUser(Registeration registeration)  {
		
		try {
		Session session= sf.openSession();
		session.beginTransaction();
		Serializable ss = session.save(registeration);
		session.getTransaction().commit();
		session.close();
		return "success";
		}
		catch(Exception e) {
			System.out.println(e);
			return "Error "+e.getLocalizedMessage();
		}
	}
}
