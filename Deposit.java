package Session8.Assignment3;

public class Deposit extends Thread {

	private double depositAmount;
	private BankAccount bc;
	
	public Deposit(BankAccount bc, double amount){
		this.bc = bc;
		this.depositAmount = amount;
	}
	
	@Override
	public void run() {
		bc.deposit(depositAmount);
		
	}
}
