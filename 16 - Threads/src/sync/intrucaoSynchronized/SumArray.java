package src.sync.intrucaoSynchronized;

// Usa um bloco sincronizado para controlar o acesso a sumArray
class SumArray {
	private int sum;
	int sumArray(int nums[]) { // Aqui, sumArray() não é sincronizado
		sum = 0; 

		for(int i=0; i<nums.length; i++) { 
			sum += nums[i]; 
			System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
			try { 
				Thread.sleep(10); // permite a alternância de tarefas
			}
			catch(InterruptedException exc) {
				System.out.println("Thread interrupted.");
			} 
		} 
		return sum;
	}}
