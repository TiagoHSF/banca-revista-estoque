package Entidades;

public class Revista extends Produto {

	private String editora;
	
	public Revista(final Long codigo, final String nome, final String editora) {
		super(codigo, nome);
		this.editora = editora;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}
