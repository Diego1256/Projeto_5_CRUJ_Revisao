package interfaces;

import java.util.List;

import entities.Fornecedor;

public interface IFornecedorRepository extends IBaseRepository<Fornecedor> {
	
		List<Fornecedor> findByNome(String nome) throws Exception;

}
