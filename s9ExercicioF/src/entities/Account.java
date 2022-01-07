package entities;

public class Account {

	private int acNumber;
	private String acHolder;
	private double balance;

	public Account(int acNumber, String acHolder) {
		this.acNumber = acNumber;
		this.acHolder = acHolder;
	}

	public Account(int acNumber, String acHolder, double balance) {
		this.acNumber = acNumber;
		this.acHolder = acHolder;
		deposit(balance);
	}

	public int getAcNumber() {
		return acNumber;
	}

	public String getAcHolder() {
		return acHolder;
	}

	public void setAcHolder(String acHolder) {
		this.acHolder = acHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double deposit) {
		balance += deposit;
	}

	public void withdraw(double withdraw) {
		balance -= withdraw + 5;
	}

	public String toString() {
		return "Account "
				+ acNumber
				+ ", Holder: "
				+ acHolder
				+ ", Balance: $"
				+ String.format("%.2f", acHolder);
	}

}
