package com.cursospring.drograria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursospring.drograria.domain.Categoria;
import com.cursospring.drograria.repository.CategoriaRepository;

@RestController
@RequestMapping("categorias")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> listar(){
		
		return categoriaRepository.findAll();
	}
	
	@PostMapping
	public Categoria inserir(@RequestBody Categoria categoria) {
		
		return categoriaRepository.save(categoria);
		
	}
	
}
