package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto {

	private LocalDate dataFabricacao;

	public ProdutoUsado() {
	}

	public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	
   @Override
   public String precoEtiqueta() {
	   return getNome() 
			   +"(usado) R$"
			   +String.format("%.2f",getPreco())
			   + "(Data de Fabricação: "+ dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +")";
   }
}
