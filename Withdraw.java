package Session8.Assignment3;

public class Withdraw extends Thread{
	
	private double WithdrawAmount;
	private BankAccount bc;
	
	public Withdraw(BankAccount bc, double amount) {
		// TODO Auto-generated constructor stub
		this.WithdrawAmount = amount;
		this.bc = bc;
	}
	
	@Override
	public void run() {
		bc.withdraw(WithdrawAmount);
		
	}
}