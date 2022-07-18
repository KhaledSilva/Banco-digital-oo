
public class Main {

	public static void main(String[] args) {
		Cliente satoshi = new Cliente();
		satoshi.setNome("Satoshi");
		
		Conta cc = new ContaCorrente(satoshi);
		Conta poupanca = new ContaPoupanca(satoshi);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
	
}
