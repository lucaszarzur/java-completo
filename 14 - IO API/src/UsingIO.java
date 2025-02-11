package src;

import java.io.*;

public class UsingIO {

    private static final String MY_FILE =
            File.separator + "app" +
            File.separator + "z-pessoais" +
            File.separator + "java-completo" +
            File.separator + "14 - IO API" +
            File.separator + "file-using-io.txt";

    public UsingIO() {

        try {
            writeFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        readFile();
    }

    private void writeFile() throws IOException {

        final File file = new File(MY_FILE);

        boolean fileIsCreated = false;

        if (!file.exists()) {
            fileIsCreated = file.createNewFile();
        }

        if (fileIsCreated || file.exists()) {
            final OutputStream output = new FileOutputStream(MY_FILE);

            output.write("Ola Mundo IO".getBytes("UTF-8"));
            output.close();

            System.out.println("Dados gravados no arquivo");
        }
    }

    private void readFile() {

        // 1 byte = 8 bits
        // 1 char UTF-8 = 1 bytes
        // 1 char UTF-16 = 2 bytes

        // MODO ANTIGO
//        InputStream input = null;
//
//        try {
//            input = new FileInputStream(MY_FILE);
//
//            int content;
//
//            while ((content = input.read()) != -1) {
//                System.out.print((char) content);
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        } finally {
//            if (input != null) {
//                try {
//                    input.close();
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }



        // MODO NOVO
//        try (final InputStream input = new FileInputStream(MY_FILE)) {
//            int content;
//            while ((content = input.read()) != -1) {
//                System.out.print((char) content);
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

        try (final FileReader reader = new FileReader(MY_FILE)) {
            int content = reader.read();

            while (content != -1) {
                System.out.print((char) content);
                content = reader.read();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new UsingIO();
    }
}