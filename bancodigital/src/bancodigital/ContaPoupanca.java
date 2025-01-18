package bancodigital;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void extratoPoupanca () {
		System.out.println("CONTA POUPANÇA");
		super.extratoInfos();
	}

	
	
}
