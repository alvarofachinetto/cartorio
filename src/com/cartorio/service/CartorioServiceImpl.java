package com.cartorio.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.cartorio.dao.CartorioDAO;
import com.cartorio.model.Cartorio;

@EnableWebMvc
@Service
public class CartorioServiceImpl implements CartorioService{
	
	@Autowired
	private CartorioDAO cartorioDAO;
	
	@Transactional
	@Override
	public Cartorio updateCartorio(Long idCartorio) {
		return cartorioDAO.updateCartorio(idCartorio);
	}

	@Transactional
	@Override
	public List<Cartorio> listCartorios() {
		return cartorioDAO.listCartorio();
	}

	@Transactional
	@Override
	public void saveCartorio(Cartorio cartorio) {
		 cartorioDAO.saveCartorio(cartorio);
	}
	@Transactional
	@Override
	public void deleteCartorio(Long idCartorio) {
		cartorioDAO.deleteCustomer(idCartorio);
	}

	
}
