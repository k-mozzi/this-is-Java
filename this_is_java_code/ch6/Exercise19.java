package ch6;

class Count {
	static final int MAX_BALANCE = 1000000;
	static final int MIN_BALANCE = 0;
	private int balance;
	
	int getBalance() {
		return balance;
	}
	
	void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
}

public class Exercise19 {

	public static void main(String[] args) {
		Count account = new Count();
		
		account.setBalance(10000);
		System.out.println("present money: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("present money: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("present money: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("present money: " + account.getBalance());
	}

}
