package james.developer.loja.service.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import james.developer.loja.model.Produto;
import james.developer.loja.repository.ProdutoRepository;
import james.developer.loja.service.ClienteService;
import james.developer.loja.service.ProdutoService;


/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 * 
 *
 */
@Service
public class ProdutoServiceImpl implements ProdutoService {

	// Singleton: Injetar os componentes do Spring com @Autowired.
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	// Strategy: Implementar os métodos definidos na interface.
	// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

	@Override
	public Iterable<Produto> buscarTodos() {
		// Buscar todos os Clientes.
		return produtoRepository.findAll();
	}

	@Override
	public Produto buscarPorId(Long id) {
		// Buscar Cliente por ID.
		Optional<Produto> produto = produtoRepository.findById(id);
		return produto.get();
	}

	@Override
	public void inserir(Produto produto) {
		
		produtoRepository.save(produto);
	}

	@Override
	public void atualizar(Long id, Produto produto) {
		
		produtoRepository.save(produto);
	
	}

	@Override
	public void deletar(Long id) {
		// Deletar Cliente por ID.
		produtoRepository.deleteById(id);
	}


}
