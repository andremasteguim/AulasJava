package entities;

public class Conta {
	private int numberAccount;
	private String name;
	private double balance; //balance = saldo
	
	public Conta(int numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.name = name;
	}
	
	public Conta(int numberAccount, String name, double balance) {
		this.numberAccount = numberAccount;
		this.name = name;
		this.balance = balance;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposito(double deposito) {
		this.balance += deposito;
	}
	
	public void saque(double saque) {
		this.balance -= (saque + 5.00);
	}
	
	public String toString() {
		return "Account "
				+ numberAccount
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
