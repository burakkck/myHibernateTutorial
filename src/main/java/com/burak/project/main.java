package com.burak.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.burak.DemoHib.personel;

public class main {
	public static void main(String[] args) {
		personel personel = new personel();
		personel.setPersonelId(4);
		personel.setPersonelAdi("yaviz");
		personel.setPersonelSoyadi("mutlu");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();  
		Session session = sessionFactory.openSession();
		System.out.println("transaction başlatıldı");
		session.beginTransaction();
		session.save(personel);
		session.getTransaction().commit();
		System.out.println("transaction tamamlandı");
		System.out.println("veri kaydedildi");
	}
}
