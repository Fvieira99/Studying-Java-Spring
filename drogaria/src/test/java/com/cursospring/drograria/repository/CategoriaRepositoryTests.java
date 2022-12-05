package com.cursospring.drograria.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cursospring.drograria.domain.Categoria;

@SpringBootTest
public class CategoriaRepositoryTests {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Test
	public void inserir() {
		
		Categoria c1 = new Categoria(null, "Bebida");
		
		categoriaRepository.save(c1);
	}
}
