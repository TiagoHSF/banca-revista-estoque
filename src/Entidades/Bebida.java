package Entidades;

public class Bebida extends Produto {

	private String tipo;

	public Bebida(final Long codigo, final String nome, final String tipo) {
		super(codigo, nome);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
