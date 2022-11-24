package ch6;

import java.util.Scanner;

class Account {
	private String ano;
	private String owner;
	private int balance;

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}

public class Exercise20 {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성하기
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("create account");
		System.out.println("--------------");

		System.out.print("account number: ");
		String ano = scanner.next();

		System.out.print("accounter name: ");
		String owner = scanner.next();

		System.out.print("first deposit: ");
		int balance = scanner.nextInt();

		Account account = new Account(ano, owner, balance);

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("result: account is created.");
				break;
			}
		}
	}

	// 계좌 목록보기
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("account list");
		System.out.println("--------------");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + '\t' + accountArray[i].getOwner() + '\t'
						+ accountArray[i].getBalance());
			}
		}
	}

	// 예금하기
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("deposit");
		System.out.println("--------------");

		System.out.print("account number: ");
		String ano = scanner.next();

		System.out.print("deposit amount: ");
		int balance = scanner.nextInt();

		Account account = findAccount(ano);

		if (account == null) {
			System.out.println("result: there is no existing account");
		}

		account.setBalance(account.getBalance() + balance);
		System.out.println("result: deposit success");
	}

	// 출금하기
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("withdraw");
		System.out.println("--------------");

		System.out.print("account number: ");
		String ano = scanner.next();

		System.out.print("withdraw amount: ");
		int balance = scanner.nextInt();

		Account account = findAccount(ano);

		if (account == null) {
			System.out.println("result: there is no existing account");
		}

		if (account.getBalance() < balance) {
			System.out.println("you can not withdraw more than your deposit");
		}

		account.setBalance(account.getBalance() - balance);
		System.out.println("result: withdraw success");
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}

}
