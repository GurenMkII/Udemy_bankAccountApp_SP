package bankaccountapp;

public class Savings extends Account {
	
	//List properties specific to the savings account
	
	private String safetyDepositBoxID, safetyDepositBoxKey;
	
	//Constructor to initialize settings for the savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1"+accountNumber;
		setSafetyDepositBox();
	}

	
	@Override
	public void setRate() {
		rate = getBaseRate()-.25;
	}
	
	
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9));
		safetyDepositBoxKey = Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9))+Integer.toString((int)(Math.random()*9));
	}
	
	
	//List any methods specific to savings account
	
	
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"Your Savings Account Features"
				+ "\nSafety Deposit Box ID: "+safetyDepositBoxID
				+ "\nSafety Deposit Box Key: "+safetyDepositBoxKey
				);
	}



}
