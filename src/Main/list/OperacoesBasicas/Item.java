/* 
 * Exercising collections usage: build a shopping car which you can add and
 * remove itens, calculate total price and display an item list
 *  Done partially independently, I needed help in certain parts (gotta
 *  study them)
 * 
 * Exercitando uso do collections: criar um carrinho de compras para o qual
 * se pode adicionar e remover itens, calcular o preco total e exibir uma
 * lista dos itens
 *  Feito de forma parcialmente independente, precisei de ajuda em algumas
 *  partes (anotadas para estudo)
 * 
 */

package Main.list.OperacoesBasicas;

public class Item {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Item (String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	//setter separado gerou problemas (valor zero nos precos, precisei de ajuda)
//	public void setPreco(double preco) {
//		this.preco = preco;
//	}
	public int getQuantidade() {
		return quantidade;
	}
	//setter separado gerou problemas (valor zero nas quantidades, precisei de ajuda)
//	public void setQuantidade(int quantidade) {
//		this.quantidade = quantidade;
//	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", Preco R$" + preco +  ", Quantidade: " + quantidade;
	}
	
	//versao da instrutora Camila Cavalcante 
//	@Override
//	public String toString() {
//		return "Item{" +
//				"nome='" + nome + '\'' +
//				", preco=" + preco +
//				", quantidade=" + quantidade +
//				'}';
//	}
}