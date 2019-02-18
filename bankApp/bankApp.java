package bankApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class bankApp {
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\Krish\\Desktop\\NewBankAccounts.csv"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st); 
		// TODO Auto-generated method stub
		
		Checking obj = new Checking("Krishna", "199508130391", 2000);
		
		Savings obj1 = new Savings("Kdn", "199603153013", 1550);
		obj.showInfo();
		System.out.println("***************");
		obj1.compound();
		obj1.showInfo();
		obj1.deposit(8000);
		obj1.withdraw(500);
		obj1.transfer("Brokerge", 2500);
		

	}

}
