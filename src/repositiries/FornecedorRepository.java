package repositiries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Fornecedor;
import factories.ConnectionFactory;
import interfaces.IFornecedorRepository;

public class FornecedorRepository implements IFornecedorRepository {

	@Override
	public void create(Fornecedor obj) throws Exception {
		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection.prepareStatement("INSERT INTO FORNECEDOR(NOME,CNPJ) VALUES(?,?)");
		statement.setString(1, obj.getNome());
		statement.setString(2, obj.getCnpj());

		statement.execute();

		connection.close();
	}

	@Override
	public void update(Fornecedor obj) throws Exception {
		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection
				.prepareStatement("update fornecedor set nome=?, cnpj=? where idfornecedor=?");
		statement.setString(1, obj.getNome());
		statement.setString(2, obj.getCnpj());
		statement.setInt(3, obj.getIdFornecedor());
		statement.execute();

		connection.close();

	}

	@Override
	public void delete(Fornecedor obj) throws Exception {
		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection.prepareStatement("delete from fornecedor where idfornecedor=?");
		statement.setInt(1, obj.getIdFornecedor());
		statement.execute();

		connection.close();

	}

	@Override
	public List<Fornecedor> findAll() throws Exception {
		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection.prepareStatement("select * from fornecedor");
		ResultSet resultSet = statement.executeQuery();

		List<Fornecedor> lista = new ArrayList<Fornecedor>();

		while (resultSet.next()) {
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setIdFornecedor(resultSet.getInt("idfornecedor"));
			fornecedor.setNome(resultSet.getString("nome"));
			fornecedor.setCnpj(resultSet.getString("cnpj"));

			lista.add(fornecedor);
		}

		connection.close();
		return lista;

	}

	@Override
	public Fornecedor findById(Integer id) throws Exception {
		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection.prepareStatement("select * from fornecedor where idfornecedor=?");
		statement.setInt(1, id);
		ResultSet resultSet = statement.executeQuery();

		Fornecedor fornecedor = null;

		if (resultSet.next()) {

			fornecedor = new Fornecedor();

			fornecedor.setIdFornecedor(resultSet.getInt("idfornecedor"));
			fornecedor.setNome(resultSet.getString("nome"));
			fornecedor.setCnpj(resultSet.getString("cnpj"));
		}

		connection.close();
		return fornecedor;
	}

	@Override
	public List<Fornecedor> findByNome(String nome) throws Exception {
		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection.prepareStatement("select * from Fornecedor where nome=?");
		statement.setString(1, nome);
		ResultSet resultSet = statement.executeQuery();

		List<Fornecedor> lista = new ArrayList<Fornecedor>();

		while (resultSet.next()) {

			Fornecedor fornecedor = new Fornecedor();

			fornecedor.setIdFornecedor(resultSet.getInt("idfornecedor"));
			fornecedor.setNome(resultSet.getString("nome"));
			fornecedor.setCnpj(resultSet.getString("cnpj"));

			lista.add(fornecedor);
		}

		connection.close();
		return lista;
	}

}
