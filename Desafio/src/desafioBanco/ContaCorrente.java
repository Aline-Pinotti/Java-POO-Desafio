package desafioBanco;

public class ContaCorrente  extends Conta{
	private static int SEQUENCIAL = 1;
	
	public ContaCorrente(Cliente cliente) {
		super(SEQUENCIAL++, cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extrato Conta Corrente ***");
		super.imprimirInfoConta();
	}


}
