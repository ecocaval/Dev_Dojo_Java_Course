package aula110Performance.test;

public class StringPerfomanceTest02 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(16);
//        sb = "1212121"; NÃO FUNCIONA
        sb.append("1111111111");
//        System.out.println(sb.);
    }

}
