package Session8.Assignment3;

public class BankAccount {
	
		
		private double balance;
		
		//Default Constructor
		public BankAccount(){
			this(1000);
		}
		public BankAccount(double bal){
			this.balance = bal;
		}
		
		public void withdraw(double amount){
			balance -= amount;
			System.out.println("You have succesfully Withdrawn $" + amount + " from your Account.");
			System.out.println("Your New Balance is: $" + balance);
		}
		
		public void deposit(double amount){
			balance += amount;
			System.out.println("You have succesfully Deposited $" + amount + " in your Account.");
			System.out.println("Your New Balance is: $" + balance);
		}
}
