package Entidades;

public abstract class Produto {

	private Long codigo;
	private String nome;
	private int estoque;
	private double valorUnitario;
	
	public Produto(final Long codigo, final String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstoque() {
		return estoque;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public void atualizarEstoque(int quantidade) throws Exception {
		try {
			if(quantidade >= 0) {
				estoque = estoque + quantidade;
			} else {
				if(estoque >= quantidade) {
					estoque = estoque - quantidade;
				} else {
					throw new Exception("Impossível obter um estoque negativo!");
				}
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
}
