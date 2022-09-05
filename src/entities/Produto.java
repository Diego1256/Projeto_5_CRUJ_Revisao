package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Produto {

	private Integer idProduto;
	private String nome;
	private Double preco;
	private Integer quantidade;
	private Fornecedor fornecedor;

}
