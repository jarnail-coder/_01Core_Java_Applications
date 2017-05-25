package _03synchronization;

public class _001SimpleMain {
	public static void main(String[] args) {
		TicketBooking obj = new TicketBooking();

		// As same object is passed to 2 threads value for that object will be
		// shared
		Thread thread1 = new Thread(obj, "Passenger1 Thread");
		Thread thread2 = new Thread(obj, "Passenger2 Thread");

		thread1.start();
		thread1.interrupt();
		thread2.start();
	}
}

class TicketBooking implements Runnable {
	int ticketsAvailable = 1;

	public void run() {

		System.out.println("Waiting to book ticket for : " + Thread.currentThread().getName());
		synchronized (this) {
			if (ticketsAvailable > 0) {
				System.out.println("Booking ticket for : " + Thread.currentThread().getName());

				// Let's say system takes some time in booking ticket (here we
				// have taken 1 second time)
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}

				ticketsAvailable--;
				System.out.println("Ticket BOOKED for : " + Thread.currentThread().getName());
				System.out.println("currently ticketsAvailable = " + ticketsAvailable);
			} else {
				System.out.println("Ticket NOT BOOKED for : " + Thread.currentThread().getName());
			}

		} // End synchronization block

	}

}

