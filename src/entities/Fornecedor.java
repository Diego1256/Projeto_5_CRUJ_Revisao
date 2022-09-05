package entities;

import java.util.List;

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
public class Fornecedor {
	private Integer idFornecedor;
	private String nome;
	private String cnpj;
	private List<Produto> produtos;
}
