package src;

public class ExceptionsEncadeadas {

    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // chama method2; lança exceções de volta para main
    public static void method1() throws Exception {
        try {
            method2(); // chama method2
        } catch (Exception ex) {
            throw new Exception("Exception thrown in method1", ex);
        }
    }

    // chama method3; lança exceções de volta para method1
    public static void method2() throws Exception {
        try {
            method3();
        } catch (Exception ex) {
            throw new Exception("Exception thrown in method2", ex);
        }
    }

    // lança Exception de volta para method2
    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
}
