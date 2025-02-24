package src.isAlive;

// Usa isAlive()
class MoreThreads {
	public static void main(String args[]) { 
		System.out.println("Main thread starting.");
	
		MyThread mt1 = new MyThread("Child #1"); 
		MyThread mt2 = new MyThread("Child #2"); 
		MyThread mt3 = new MyThread("Child #3");
		
		do { 
			System.out.print("."); 
			try {
				Thread.sleep(100);
			} catch(InterruptedException exc) {
				System.out.println("Main thread interrupted."); 
			}
		} while (mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive()); // Espera até todas as threads terminarem

		System.out.println("Main thread ending.");
	}
}