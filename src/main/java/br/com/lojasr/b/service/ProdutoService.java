package br.com.lojasr.b.service;

import br.com.lojasr.b.model.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {

    Produto save(Produto produto);

    List<Produto> findAll();

    Optional<Produto> findById(Long id);

    Produto update(Produto produto);

    void deleteById(Long id);
}
