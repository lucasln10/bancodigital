package bancodigital;

public class ContaCorrente extends Conta {
	
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void extratoCorrente () {
		System.out.println("CONTA CORRENTE");
		super.extratoInfos();
	}

}
