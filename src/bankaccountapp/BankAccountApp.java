package bankaccountapp;

import java.util.LinkedList;
import java.util.List;
import java.util.PrimitiveIterator.OfDouble;


public class BankAccountApp {

	public static void main(String[] args) {

		List<Account> accounts = new LinkedList<Account>();
		
		
		
		
		
//		//Read a CSV File then create new accounts based on that data
		String file = "C:\\OneDrive\\WIN2020\\TiTUS\\week11\\5_22_20\\bankAccountApp\\original.csv";
		

		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if (accountType.equals("Savings")){
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")){
				accounts.add(new Checking(name, sSN, initDeposit));
			} else System.out.println("ERROR READING ACCOUNT TYPE");
		}
		
		for (Account acc : accounts) {
			acc.showInfo();
		}
		
		
		
		
		
		
//		Checking chkacc1 = new Checking("Tom Wilson", "378229673", 1500);
//		Savings savacc1 = new Savings("Rich Lowe", "356115327", 2500);
//		
//		savacc1.showInfo();
//		chkacc1.showInfo();
//		
//		
//		savacc1.deposit(5000);
//		savacc1.withdraw(200);
//		savacc1.transfer("FriendAccNum", 1000);
//		
//		savacc1.compound();
		
	}

}
