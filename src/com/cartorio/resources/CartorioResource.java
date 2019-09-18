package com.cartorio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cartorio.model.Cartorio;
import com.cartorio.service.CartorioService;

@RestController
@RequestMapping("/cartorios")
public class CartorioResource {

	@Autowired
	private CartorioService cartorioService;
	
	@GetMapping("/")
	public ResponseEntity<List<Cartorio>> listCartorios(){
		List<Cartorio> cartorios = cartorioService.listCartorios();
		return ResponseEntity.ok().body(cartorios);
	}
	
}
