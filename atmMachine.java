import java.util.Scanner;

public class atmMachine {
		double balance = 2000;
		
		public ATM(){
			System.out.println("Thank you for using of Bank");
		}
		
		public void checkBalance(){
			System.out.println("Your balance is :" + balance);
		}
		
		public void deposit(double amount){
			balance += amount;
			System.out.println("You just deposited: " + amount);
			checkBalance();
		}
		public static void main(String[] args){
			ATM a = new ATM();
			a.checkBalance();
			a.deposit(amount: 3000);
	}
	                                        
	                           

}
