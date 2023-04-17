package aula97Exceptions.domain;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {

        // closes the last parameter first
        try (Reader1 reader1 = new Reader1();
             Reader2 reader2 = new Reader2()) {

        } catch (IOException e) {

        } finally {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
