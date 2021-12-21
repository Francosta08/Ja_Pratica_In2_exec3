package praticaIntegrado2Java;

public class Produto {
   
    
	private String nome;
	private int quantidade;
	private double preco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double somarProduto() {
		
	int total =0;
		for(int i=0;i<=total;i++) {
		preco+= preco;
	}
		
		
		return preco;
	}
}