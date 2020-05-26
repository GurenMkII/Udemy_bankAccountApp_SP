package bankaccountapp;

public abstract class Account implements IBaseRate {
	
	//List common properties for savings and checking accounts.
	private String name, sSN;
	protected String accountNumber;
	private Double balance;
	protected double rate;
	private static int index = 10000;
	
	
	//Constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		this.balance = initDeposit;
		
		
		//Set account number
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
		
	}
	
	public abstract void setRate();
	
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index; 
		String randomNumber= Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9));
		return lastTwoOfSSN+uniqueID+randomNumber;
	}
	
	public void compound() {
		double accruedInterest = balance*(rate/100);
		balance = balance + accruedInterest;
		System.out.println("\nAccrued Interest: $"+accruedInterest);
		printBalance();
	}
	
	//List common methods
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("\nDepositing $"+amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("\nWithdrawing $"+amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("\nTransfering $"+amount+" to "+toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: $"+balance);
	}
	
	public void showInfo() {
		System.out.println("\nNAME: "+name+"\nACCOUNT NUMBER: "+accountNumber+"\nBALANCE: "+balance+"\nRATE: "+rate+"%");
	}

}
