package bankApp;

import java.util.Random;

public class Checking extends Account {
	// List properties specific to a checking account
	private long debitCardNumber;
	private int debitCardPin;
	
	//Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit){
		super(name, sSN, initDeposit);
		this.accountNumber = "2"+accountNumber;
		/*System.out.println("ACC NUMBER:"+this.accountNumber);
		System.out.println("NEW CHECKING ACCOUNT");*/
		setDebitCard();
	}
	// List any methods specific to checking account
	
	@Override
	public void setRate(){
		double rate = getBaseRate() * 0.15;
	}
	
	private void setDebitCard(){
		//To set 3 digit id 
		debitCardNumber = (long) (Math.random()* Math.pow(10,12));
		System.out.println("Card No:"+debitCardNumber);
		// To set 4 digit password
		debitCardPin = (int) (Math.random()* Math.pow(10,4));
		System.out.println("Pin:"+debitCardPin);
	}
	public void showInfo(){
		System.out.println(rate);
	}

	

}
