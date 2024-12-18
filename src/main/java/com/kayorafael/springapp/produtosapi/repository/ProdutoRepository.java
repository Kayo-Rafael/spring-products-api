package com.kayorafael.springapp.produtosapi.repository;

import com.kayorafael.springapp.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository <Produto, String> {
    List<Produto> findByNome(String nome);
}
