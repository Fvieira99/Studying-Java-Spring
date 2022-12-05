package com.cursospring.drograria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.drograria.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Short> {

}
