package src.myThreadsImproved;

// MyThread melhorada

/*
	Embora o programa anterior seja perfeitamente válido, algumas melhorias simples o tornarão mais eficiente e fácil de usar.
	Algumas melhorias simples o código ficará mais eficiente e fácil de usar.
	• É possível fazer a thread começar a ser executada assim que for criada.
	• No caso de MyThread, isso é feito pela instanciação de um objeto Thread dentro do construtor de MyThread.
	• Em segundo lugar, não há necessidade de MyThread armazenar o nome da thread
	• O nome é atribuído a uma thread quando ela é criada
 */

class MyThread implements Runnable {

	Thread thrd; // Uma referência ao objeto thread é armazenada em thrd.

	MyThread(String name) {
		thrd = new Thread(this, name); 
		thrd.start(); 
	}
	
	
	public void run() {
		System.out.println(thrd.getName() + " starting."); 
		try {
			for(int count=0; count<10; count++) { 
				Thread.sleep(400); 
				System.out.println("In " + thrd.getName() + ", count is " + count);
			}
		} catch(InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted."); 
			System.out.println(thrd.getName() + " terminating.");
		}
	}
}
