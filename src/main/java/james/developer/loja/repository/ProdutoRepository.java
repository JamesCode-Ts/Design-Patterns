package james.developer.loja.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import james.developer.loja.model.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}
