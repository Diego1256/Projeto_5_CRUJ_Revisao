package principal;

import controllers.FornecedorController;

public class Program {

	public static void main(String[] args) {
	
		FornecedorController fornecedorController = new FornecedorController();
		
		fornecedorController.cadastrarFornecedor();
	}
}
