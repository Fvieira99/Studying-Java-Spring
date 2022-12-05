package com.cursospring.drograria.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cursospring.drograria.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {
	
	@Autowired
	private ProdutoRepository produtoRepository;
		
	@Test
	public void inserir() {
		Produto p1 = new Produto(null, "Coca-Cola" , Byte.valueOf("15"), BigDecimal.valueOf(10.50), LocalDate.of(2022, 12, 03), null);
				
		this.produtoRepository.save(p1);
	}
	

}
