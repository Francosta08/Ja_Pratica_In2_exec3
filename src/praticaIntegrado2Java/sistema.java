package praticaIntegrado2Java;

public class sistema {

	public static void main(String[] args) {
		Produto produto1 = new Produto();
		
		produto1.setNome("Iphone 10");
		produto1.setQuantidade(1);
		produto1.setPreco(4356.56);
		
		Produto produto2 = new Produto();
		produto2.setNome("freezer 246 l");
		produto2.setQuantidade(1);
		produto2.setPreco(158.06);
		
		Produto produto3 = new Produto();
		produto3.setNome("Fogão 4 bocas");
		produto3.setQuantidade(1);
		produto3.setPreco(356.56);
		
		
		System.out.println("Produto 1 : "+ produto1.getNome()+" Quantidade :"+"Valor : " + produto1.getPreco());
		System.out.println("Produto 2 : "+ produto2.getNome()+" Quantidade :"+"Valor : " + produto2.getPreco());
		System.out.println("Produto 3 : "+ produto3.getNome()+" Quantidade :"+"Valor : " + produto3.getPreco());
		
		System.out.println("Total : " +produto1.somarProduto());
		

	}

}
