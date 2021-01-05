package com.xworkz.corona.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.xworkz.corona.dto.CoronaDTO;

public class CoronaDAOImpl implements CoronaDAO {

	
	public  CoronaDAOImpl() {
        System.out.println("created" + this.getClass().getSimpleName());
     }
 	private SessionFactory factory;

 	public CoronaDAOImpl(SessionFactory factory) {
		System.out.println(this.getClass().getSimpleName() + " created...");
		this.factory = factory;
	}
	@Override
	public long save(CoronaDTO coronDto) {
		Session session = null;
		Transaction transaction = null;
		long id=coronDto.getId();
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			//session.save(coronDto);
			id = (Long) session.save(coronDto);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return id;
	}
	
	
}
	

