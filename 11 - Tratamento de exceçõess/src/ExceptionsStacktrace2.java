package src;

public class ExceptionsStacktrace2 {

    public static void main(String[] args) {
        printStackTrace();
        getStackTrace();
        getMessage();
        toStringg();
        getCause();
    }

    public static void printStackTrace() {
        System.out.println("\n\nprintStackTrace()");

        try {
            int result = 10 / 0; // Vai lançar uma ArithmeticException
        } catch (ArithmeticException e) {
            e.printStackTrace(); // Imprime o stack trace completo no console
        }
    }

    public static void getStackTrace() {
        System.out.println("\n\ngetStackTrace()");


        try {
            String text = null;
            System.out.println(text.length()); // Vai lançar uma NullPointerException
        } catch (NullPointerException e) {
            StackTraceElement[] elements = e.getStackTrace();
            for (StackTraceElement element : elements) {
                System.out.println("Classe: " + element.getClassName() + ", Método: " + element.getMethodName() + ", Linha: " + element.getLineNumber());
            }
        }
    }

    public static void getMessage() {
        System.out.println("\n\ngetMessage()");

        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Mensagem de erro: " + e.getMessage()); // Exibe a mensagem de erro
        }
    }

    public static void toStringg() {
        System.out.println("\n\ntoString()");

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exceção: " + e.toString()); // Exibe a exceção em formato resumido
        }
    }

    public static void getCause() {
        System.out.println("\n\ngetCause()");

        try {
            throw new ArithmeticException("Erro de aritmética");
        } catch (ArithmeticException e) {
            Exception cause = (Exception) e.getCause(); // Vai retornar null, pois não há causa
            System.out.println("Causa: " + cause);
        }
    }

}
