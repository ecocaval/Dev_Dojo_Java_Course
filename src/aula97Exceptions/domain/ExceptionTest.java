package aula97Exceptions.domain;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionTest {
    public static void main(String[] args) {
        createNewFile();
    }

    private static void createNewFile() {
        File file = new File("teste2\\test.txt");
        try {
            boolean created = file.createNewFile();
            System.out.println(created);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
