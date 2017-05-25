package _03synchronization;

class Shared {
	int noOfTicket = 0;

	// With same object either this method execute completly
	public synchronized void getTicket() {
		System.out.println("Geeting Ticket");
		if (noOfTicket > 0) {
			System.out.println("Taking Ticket");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Got Ticket No:" + noOfTicket);
			noOfTicket--;
		}
	}

	// Or either this one
	public synchronized void addNewTicket() {
		System.out.println("Adding Ticket");
		noOfTicket++;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ticket Added");
	}
}

public class MainSyn {
	public static void main(String[] args) {
		Shared shared = new Shared();
		new Thread(new Runnable() {
			@Override
			public void run() {
				shared.addNewTicket();
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				shared.getTicket();
			}
		}).start();
	}
}
