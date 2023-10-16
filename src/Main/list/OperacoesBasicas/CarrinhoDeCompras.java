/* 
 * Exercising collections usage: build a shopping car which you can add and
 * remove itens, calculate total price and display an item list
 * 
 * Exercitando uso do collections: criar um carrinho de compras para o qual
 * se pode adicionar e remover itens, calcular o preco total e exibir uma
 * lista dos itens
 * 
 */

package Main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> carrinhoDeComprasList;
	
	public CarrinhoDeCompras() {
		this.carrinhoDeComprasList = new ArrayList<>();	
	}
	//adiciona itens
	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		this.carrinhoDeComprasList.add(item);
		//carrinhoDeComprasList.add(new Item(nome, preco, quantidade)); 
	}
	//remove itens
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		for (Item i : carrinhoDeComprasList) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(i);
			}
		}
		carrinhoDeComprasList.removeAll(itensParaRemover);
	}
	//metodo para calcular valor total (precisei de ajuda)
	public void calcularValorTotal() {
		double precoTotal = 0d;
		for(Item i: carrinhoDeComprasList) {
			double valorI = i.getPreco() * i.getQuantidade();
			precoTotal = precoTotal + valorI;
		}
		System.out.println("O preco total dos itens e: " + "R$" + String.format("%.2f", precoTotal) + ".");
	}
	//exibe os itens
	public void exibirItens() {
		System.out.println(this.carrinhoDeComprasList);
	}
		
	public static void main(String[] args) {
		//criando um carrinho de compras
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		//adicionado itens ao carrinho
		carrinhoDeCompras.adicionarItem("Racao",23d,3);
		carrinhoDeCompras.adicionarItem("Ovos",1d,15);
		carrinhoDeCompras.adicionarItem("Margarina",12d,2);
		carrinhoDeCompras.adicionarItem("Pao",1d,10);
		carrinhoDeCompras.adicionarItem("Macarrao",4d,2);
		carrinhoDeCompras.adicionarItem("Molho de Tomate",8d,2);
		
		//exibindo itens no carrinho
		carrinhoDeCompras.exibirItens();
		
		//removendo itens e reduzindo os carboidratos do carrinho
		carrinhoDeCompras.removerItem("Pao");
		
		//exibindo carrinho novamente
		carrinhoDeCompras.exibirItens();
		
		//calculando valor dos itens
		carrinhoDeCompras.calcularValorTotal();
	}
}