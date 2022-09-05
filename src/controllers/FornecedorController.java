package controllers;

import javax.swing.JOptionPane;

import entities.Fornecedor;
import repositiries.FornecedorRepository;

public class FornecedorController {
	
	public void cadastrarFornecedor() {
		
		try {
			System.out.println("\n ***CADASTRO DE FORNECEDOR*** \n");
			
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setNome(JOptionPane.showInputDialog("Entre com o nome do fornecedor: "));
			fornecedor.setCnpj(JOptionPane.showInputDialog("Entre com o CNPJ do fornecedor: "));
			
			FornecedorRepository fornecedorRepository = new FornecedorRepository();
			fornecedorRepository.create(fornecedor);
			
			JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso!!!");
			
			
		}
		catch(Exception e) {
			System.out.println("\nErro: "+e.getMessage());
		}
	}

}
