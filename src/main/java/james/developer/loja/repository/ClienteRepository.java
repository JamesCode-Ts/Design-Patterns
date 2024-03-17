package james.developer.loja.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import james.developer.loja.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}