package src.extendThreads;

/*
	A implementação de Runnable é uma maneira de criar uma classe que possa instanciar objetos de thread. A extensão de Thread é outra.

	Exemplo: Herança da classe Thread para o programa UseThreadsImproved.
 */

class MyThread extends Thread {
	
	MyThread(String name) {
		super(name); // nomeia a Thread
		start();  // inicia a trhead
	}
	
	// Começa a execução da nova thread
	public void run() {
		System.out.println(getName() + " starting."); 
		try {
			for(int count=0; count<10; count++) { 
				sleep(400); 
				System.out.println("In " + getName() + ", count is " + count);
			}
		} catch(InterruptedException exc) {
			System.out.println(getName() + " interrupted."); 
			System.out.println(getName() + " terminating.");
		}
	}
}
