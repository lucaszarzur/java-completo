package src.priority;

// Demonstra as prioridades das threads
class Priority implements Runnable {
	int count; 
	Thread thrd;
	
	static boolean stop = false; 
	static String currentName;

	// Constrói uma nova thread. Observe que esse construtor não inicia realmente a execução das threads
	Priority(String name) { 
		thrd = new Thread(this, name); 
		count = 0; 
		currentName = name;
	}

	// Começa a execução da nova thread
	public void run() {
		System.out.println(thrd.getName() + " starting.");
	
		do {
			count++;
			if(currentName.compareTo(thrd.getName()) != 0) { 
				currentName = thrd.getName(); 
				System.out.println("In " + currentName);
			}		
		} while(stop == false && count < 10000000); // A primeira thread a alcançar 10.000.000 interrompe todas as threads

		stop = true;

	System.out.println("\n" + thrd.getName() + " terminating.");
	}
}