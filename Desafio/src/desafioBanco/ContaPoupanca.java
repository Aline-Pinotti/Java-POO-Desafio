package desafioBanco;

public class ContaPoupanca extends Conta{
	private static int SEQUENCIAL = 1;
	
	public ContaPoupanca(Cliente cliente) {
		super(SEQUENCIAL++, cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extrato Conta Poupança ***");
		super.imprimirInfoConta();
	}

}
