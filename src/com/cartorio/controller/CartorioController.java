package com.cartorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cartorio.model.Cartorio;
import com.cartorio.service.CartorioService;

@Controller
@RequestMapping("/cartorio")
public class CartorioController {

	@Autowired
    private CartorioService cartorioService;

//	pasta dos arquivo
	private final String CARTORIO_URI = "cartorio/";

	//  listar todos os cartorios
    @GetMapping("/")
    public ModelAndView listCartorio() {
        List <Cartorio> cartorio = cartorioService.listCartorios();
        return new ModelAndView(CARTORIO_URI+"list" , "cartorios", cartorio);
    }
//  mostra o formulário
    @GetMapping("/showForm")
    public ModelAndView showFormCartorio(Cartorio cartorio) {
        return new ModelAndView(CARTORIO_URI+"form","cartorio", cartorio);
    }
// salva o nome do cartório
    @PostMapping("/save")
    public ModelAndView saveCartorio(@ModelAttribute Cartorio cartorio, RedirectAttributes attributes) {
        cartorioService.saveCartorio(cartorio);
        attributes.addFlashAttribute("sucesso", "Cartorio cadastrado com sucesso!");
        return new ModelAndView("redirect:/"+CARTORIO_URI);
    }
// atualiza o cartorio
    @GetMapping("/update")
    public ModelAndView updateCartorio(@RequestParam("idCartorio") Long idCartorio) {
    	Cartorio cartorio = cartorioService.updateCartorio(idCartorio);
        return new ModelAndView(CARTORIO_URI+"form", "cartorio", cartorio);
    }
// deleta o cartorio
    @GetMapping("/delete")
    public ModelAndView deleteCartorio(@RequestParam Long idCartorio) {
        cartorioService.deleteCartorio(idCartorio);
        return new ModelAndView("redirect:/"+CARTORIO_URI);
    }
}
