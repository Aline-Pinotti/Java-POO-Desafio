package desafioBanco;

public class Agencia {
	private int codAgencia;
	private String descricao;
	private Banco banco;
	
	private int SEQUENCIAL = 1;	
		
	public Agencia(String descricao, Banco banco) {		
		this.descricao = descricao;
		this.banco = banco;
		this.codAgencia = SEQUENCIAL++;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCodAgencia() {
		return codAgencia;
	}
	public Banco getBanco() {
		return banco;
	}
	
}
