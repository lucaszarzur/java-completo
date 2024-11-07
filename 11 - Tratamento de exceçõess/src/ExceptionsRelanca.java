package src;

public class ExceptionsRelanca {

	public static void main(String[] args) {

        try { // chama throwException para demonstrar o desempilhamento
            throwException();
        } catch (Exception ex) {
            System.err.println("Exception handled in main");
        }
	}

    // demonstra try...catch...finally
    public static void throwException() throws Exception {
	    try {
            System.out.println( "Method throwException" );
            throw new Exception(); // gera a exceção
        } catch (Exception exception) {
            System.err.println("Exception handled in method throwException");
            throw exception; // lança novamente para processamento adicional
        } finally {
            System.err.println("Finally executed in throwException");
        }
    }
}
