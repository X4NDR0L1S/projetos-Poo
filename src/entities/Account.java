package entities;

public class Account {
	
	private int numero;
	private String titular;
	private double saldo;
	
	public Account(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public Account(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double amount) {
		saldo += amount;
	}
	
	public void sacar(double amount) {
		saldo -= amount + 5.0;
	}
	
	public String toString() {
		return "Conta: "
				+numero
				+", Titular: "
				+ titular
				+" , Saldo: R$ "
				+ String.format("%.2f", saldo);
	}

}
