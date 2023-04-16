package aula88Interfaces.domain;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;

    public abstract void load();

    public default void checkPermission() {
        System.out.println("Checking user permissions");
    }

    public static void retrieveMaxDataSize() {
        System.out.println(MAX_DATA_SIZE);
    }

}
