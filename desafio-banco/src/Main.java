
public class Main {

	public static void main(String[] args) {
		
		Cliente teste = new Cliente();
		teste.setNome("Maria Santos de Jesus");
		teste.setCpf("123456789123");
		teste.setEndereco("Alameda A, 475");
		teste.setTelefone("7188955874");
		
		Conta cc = new ContaCorrente(teste);
		Conta poupanca = new ContaPoupanca(teste);
		
		cc.depositar(300);
		poupanca.depositar(100);
		cc.imprimirInfosComuns();
		
		
	}

}
