package com.cartorio.service;

import java.util.List;

import com.cartorio.model.Cartorio;

public interface CartorioService {
	
	public List<Cartorio> listCartorios();
	
	public void saveCartorio(Cartorio cartorio);
	
	public Cartorio updateCartorio(Long id);
	
	public void deleteCartorio(Long id);
}
