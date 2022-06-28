/*inserir a palavra "abstract" garante que ninguém vai poder implementar
uma new class conta, já que não faz sentido ter somente uma conta sem especificar se ela é
corrente ou poupança */

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public void sacar(double valor) {
		saldo -= valor;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void transferir(double valor, Conta contaDestino) {
		
		if(valor <= this.saldo) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.out.println("Operação inválida. Saldo insuficiente!");
		}
		
	}

	private int getAgencia() {
		return agencia;
	}

	private int getNumero() {
		return numero;
	}

	private double getSaldo() {
		return saldo;
	}
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s ", this.cliente));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		
	}
	

}
