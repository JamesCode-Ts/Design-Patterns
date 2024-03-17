package james.developer.loja.service;

import james.developer.loja.model.Produto;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de produto. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 * 
 */
public interface ProdutoService {

	Iterable<Produto> buscarTodos();

	Produto buscarPorId(Long id);

	void inserir(Produto produto);

	void atualizar(Long id, Produto produto);

	void deletar(Long id);

}
