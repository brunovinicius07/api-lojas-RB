package br.com.lojasr.b.repository;

import br.com.lojasr.b.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
