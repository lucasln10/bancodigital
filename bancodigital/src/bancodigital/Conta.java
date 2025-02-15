package bancodigital;

public class Conta implements IConta {
	private static final int AGENCIA_PADRAO = 001;
	private static int sequencial = 1;
	
	protected int numero;
	protected int agencia;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta (Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = sequencial++;
		this.cliente = cliente;
	}	
	

	public double getNumero() {
		return numero;
	}


	public double getAgencia() {
		return agencia;
	}
	

	public double getSaldo() {
		return saldo;
	}
	
	public void sacar (double valor) {
		if (saldo <= 0) {
			System.out.println("Saldo insuficente");
		}else {
			saldo -= valor;
			System.out.println("Valor que voce deseja sacar é " + valor + ". saldo atual: " + saldo);
		}
	}

	public void depositar (double valor) {
		saldo += valor;
		System.out.println("Valor a ser depositado " + valor + ". saldo atual: " + saldo);
	}
	
	public void transferir (double valor, Conta contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void extratoInfos () {
		System.out.println(String.format("Nome: %s", this.cliente.getNome()));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("saldo: %.2f", this.saldo));
		
	}


}
