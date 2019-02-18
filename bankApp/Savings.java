package bankApp;

public class Savings extends Account {
	
	// List properties specific to savings account
	private int identifySafetyBox;
	private int accessSafetyBox;
	
	//Constructor to initialize savings account properties
	public Savings(String name, String sSN, double initDeposit){
		super(name, sSN, initDeposit);
		this.accountNumber = "1"+accountNumber;
		/*System.out.println("ACC NUMBER:"+this.accountNumber);
		System.out.println("NEW SAVINGS ACCOUNT");*/
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		double rate = getBaseRate() - 0.25;
	}
	private void setSafetyDepositBox(){
		//To set 3 digit id 
		identifySafetyBox = (int) (Math.random()* Math.pow(10,3));
		System.out.println("ID:"+identifySafetyBox);
		// To set 4 digit password
		accessSafetyBox = (int) (Math.random()* Math.pow(10,4));
		System.out.println("Key:"+accessSafetyBox);
	}
	// List any methods specific to Savings account
	
	
	public void showInfo(){
		super.showInfo();
		System.out.println(rate);
	}

	
		
	
	

}
