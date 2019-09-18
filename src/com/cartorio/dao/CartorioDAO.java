package com.cartorio.dao;

import java.util.List;

import com.cartorio.model.Cartorio;

public interface CartorioDAO {

	public List <Cartorio> listCartorio();

    public void saveCartorio(Cartorio cartorio);

    public Cartorio updateCartorio(Long idCartorio);

    public void deleteCustomer(Long idCartorio);
}
