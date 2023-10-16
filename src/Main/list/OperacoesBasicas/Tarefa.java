/*
 *  code along example / copiado durante aula 
 * Instructor/Instrutora: Camila Cavalcante (Digital Innovation One)
 * 
 */

package Main.list.OperacoesBasicas;

public class Tarefa {
	//atributo
	private String descricao;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return  descricao;
	}
}