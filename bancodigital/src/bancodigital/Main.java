package bancodigital;

public class Main {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("lucas");
		Conta corrente = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

	
		System.out.println(corrente.getSaldo());
		System.out.println(poupanca.getSaldo());
		
		corrente.depositar(100);
		corrente.sacar(50);
		corrente.transferir(45, poupanca);

		poupanca.depositar(80);
		poupanca.sacar(5);
		poupanca.depositar(10);
		
		System.out.println(corrente.getSaldo());
		System.out.println(poupanca.getSaldo());
		
		corrente.extratoInfos();
		poupanca.extratoInfos();
	}
}
