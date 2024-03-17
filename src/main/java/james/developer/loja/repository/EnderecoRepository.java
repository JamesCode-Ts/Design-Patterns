package james.developer.loja.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import james.developer.loja.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}