package com.cartorio.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cartorio.model.Cartorio;

@Repository
public class CartorioDAOImpl implements CartorioDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Cartorio> listCartorio() {
		return sessionFactory.getCurrentSession().createQuery("from Cartorio")
                .list();
	}
	@Override
	public void saveCartorio(Cartorio cartorio) {
		Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(cartorio);
	}

	@Override
	public Cartorio updateCartorio(Long idCartorio) {
		 Session currentSession = sessionFactory.getCurrentSession();
	     Cartorio cartorio = currentSession.get(Cartorio.class, idCartorio);
	     return cartorio;
	}

	@Override
	public void deleteCustomer(Long idCartorio) {
		Session session = sessionFactory.getCurrentSession();
        Cartorio cartorio = session.byId(Cartorio.class).load(idCartorio);
        session.delete(cartorio);
	}

}
