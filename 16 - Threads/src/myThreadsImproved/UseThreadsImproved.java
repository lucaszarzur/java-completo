package src.myThreadsImproved;

class UseThreadsImproved {
	public static void main(String args[]) {
		System.out.println("Main thread starting.");
		
		MyThread mt = new MyThread("Child #1"); // Agora a thread começa quando é criada.

		for(int i=0; i < 50; i++) { 
			System.out.print("."); 
			try {
				Thread.sleep(100);
			} catch(InterruptedException exc) {
				System.out.println("Main thread interrupted.");
			}
		}
		System.out.println("Main thread ending.");
	}
}