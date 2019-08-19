package Session8.Assignment3;

public class BankAccountTester {
	public static void main(String[] args) {


		BankAccount Syncd = new BankAccount(10000);
		BankAccount Unsyced = new BankAccount(50000);
		
		
		Deposit d = new Deposit(Syncd, 750);
		Withdraw w = new Withdraw(Syncd, 250);


		Deposit und = new Deposit(Unsyced, 750);
		Withdraw unw = new Withdraw(Unsyced, 250);


		Thread SyncD = new Thread(d);
		Thread SyncW = new Thread(w);
		Thread thUnsyncD = new Thread(und);
		Thread thUnsyncW = new Thread(unw);

		System.out.println("Synced Transactions:");

		SyncD.start();
		synchronized (SyncD) {
			try {
				SyncD.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		SyncW.start();
		synchronized (SyncW) {
			try {
				SyncW.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println();
		System.out.println("Unsynced Transactions:");
		thUnsyncD.start();
		//System.out.println();
		thUnsyncW.start();

	}
}
