package src;

public class ExceptionsMultiple {

    public static void main(String[] args) {
        try {
            // Código que pode lançar diferentes exceções
            int result = 10 / 0;  // Lança ArithmeticException
            String text = null;
            System.out.println(text.length());  // Lança NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Erro de Aritmética: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Erro de Ponteiro Nulo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro geral: " + e.getMessage());
        }

    }

}
