
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Bruno");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100000);
		cc.transferir(5000, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
