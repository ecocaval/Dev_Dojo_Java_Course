package aula88Interfaces;

import aula88Interfaces.domain.DataLoader;
import aula88Interfaces.domain.DatabaseLoader;
import aula88Interfaces.domain.FileLoader;

public class Main {
    public static void main(String[] args) {
        DatabaseLoader dbLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        dbLoader.load();
        dbLoader.remove();
        dbLoader.checkPermission();

        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();

        dbLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();
    }
}
