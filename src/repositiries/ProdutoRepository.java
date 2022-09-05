package repositiries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import entities.Produto;
import factories.ConnectionFactory;
import interfaces.IProdutoRepository;

public class ProdutoRepository implements IProdutoRepository {

	@Override
	public void create(Produto obj) throws Exception {
		Connection connection = ConnectionFactory.createConnection();
		PreparedStatement statement = connection.prepareStatement("INSERT INTO PRODUTO(NOME, PRECO, QUANTIDADE) VALUES(?, ?, ?)");
		
		statement.setString(1, obj.getNome());
		statement.setDouble(2, obj.getPreco());
		statement.setInt(3, obj.getQuantidade());
		
		statement.execute();
		
		connection.close();
		
	}

	@Override
	public void update(Produto obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Produto obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Produto> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> findByPreco(Double precoMin, Double precoMax) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
