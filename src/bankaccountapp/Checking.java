package bankaccountapp;

public class Checking extends Account {
	
	//List properties specific to the checking account
	private String debitCardNumber, debitCardPIN;
	
	//Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2"+accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate()*.15;
	}
	
	//List any methods specific to the checking account
	private void setDebitCard() {
		debitCardNumber = Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9));
		debitCardPIN = Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"Your Checking Account Features"
				+ "\nDebit Card Number: "+debitCardNumber
				+ "\nDebit Card PIN: "+debitCardPIN
				);
	}

}
