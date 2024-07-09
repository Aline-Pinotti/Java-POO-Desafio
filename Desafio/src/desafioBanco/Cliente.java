package desafioBanco;

public class Cliente {
	private int codCliente;
	private String nome;
	
	private int SEQUENCIAL = 1;
	
	public Cliente(String nome) {
		this.nome = nome;
		this.codCliente = SEQUENCIAL++;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getCodCliente() {
		return this.codCliente;
	}
	
	
}
