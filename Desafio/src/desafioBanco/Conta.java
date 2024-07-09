package desafioBanco;

public class Conta {
	protected Agencia agencia;
	protected int numeroConta;
	protected Cliente cliente;
	protected double saldo;
	
	Banco BANCO_PADRAO = new Banco("Banco do Brasil", 1); // aqui eu chamaria o padrão... como não tem, vou instanciar 	
	Agencia AGENCIA_PADRAO = new Agencia("", BANCO_PADRAO); // aqui eu chamaria o padrão... como não tem, vou instanciar
				
	public Conta(int numeroConta, Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.saldo = 0.0;
	}
	
	public Agencia getAgencia() {
		return agencia;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public double getSaldo() {
		return saldo;
	} 	
	
	public boolean sacar(double valor) {
		
		if(valor > saldo) return false; // essa validação fica no controller?
		
		saldo -= valor;
		return true;
	}
	
	public boolean depositar(double valor) {		
		saldo += valor;
		return true;
	}
	
	public boolean transferir(double valor, Conta contaDestino) {
		
		if(!this.sacar(valor)) return false;
		return contaDestino.depositar(valor);
		
	}
	
	protected void imprimirInfoConta() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numeroConta));
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}
}
