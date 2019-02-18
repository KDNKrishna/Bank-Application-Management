package bankApp;

import java.util.Random;

public abstract class Account implements iBaseRate{
	//List the common properties for both savings and checking account
	String name;
	String accType;
	String sSN;
	double initDeposit;
	double balance;
	protected String accountNumber;
	protected double rate;
	static int index = 10000;
    
	// Constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit){
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		/*System.out.println("New Account:");
		System.out.println("Name:"+name+" "+"sSN:"+sSN+" "+"Balance:"+initDeposit);*/
		this.accountNumber = accNumber();
		System.out.println(getBaseRate());
	}	
	
	
	private String accNumber(){
		//To get the last 2 digit in a string
		String lastTwoSSN = sSN.substring(sSN.length()-2, sSN.length());
		//To get 5 digit unique id
		int uniqueID = index;
		index++;
		//to get random number
		int randomNumber = (int) (Math.random()* Math.pow(10,3));
		return lastTwoSSN + index + randomNumber;
		
	}
	
	public void compound(){
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest:"+accruedInterest);
		printBalance();
	}
	
	public void deposit(double amount){
		balance = balance + amount;
		System.out.println("Deposited money :"+ amount);
		printBalance();
	}
	
	public void withdraw(double amount){
		balance = balance - amount;
		System.out.println("Withdrawn money :"+ amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount){
		balance = balance - amount;
		System.out.println("Transfering "+ amount + "to" + toWhere);
		printBalance();
	}
	public void printBalance(){
		System.out.println("Your Balance :"+ balance);
	}
	public void showInfo(){
		System.out.println(
				"NAME:"+name +
				"\nAcc No:"+accountNumber +
				"\nBalance:"+balance +
				"\nRate:"+ rate + "%");
	}
	//List common methods


	public abstract void setRate();
}
