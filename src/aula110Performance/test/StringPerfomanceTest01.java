package aula110Performance.test;

public class StringPerfomanceTest01 {

    public static void main(String[] args) {
        var begin = System.currentTimeMillis();
        concatString(1_000);
        var end = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        concatString(10_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        concatString(100_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        concatStringBuilder(1_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        concatStringBuilder(10_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        concatStringBuilder(100_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (end - begin) + "ms");
    }

    private static void concatString(int number) {
        String text = "";
        for (int i = 0; i < number; i++) {
            text += i;
        }

    }

    private static void concatStringBuilder(int number) {
        StringBuilder stringBuilder = new StringBuilder(number);
        for (int i = 0; i < number; i++) {
            stringBuilder.append(i);
        }

    }
}
