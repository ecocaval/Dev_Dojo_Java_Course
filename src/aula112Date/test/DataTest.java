package aula112Date.test;

import java.util.Date;

public class DataTest {
    public static void main(String[] args) {
        Date date = new Date(); // milliseconds since 1970
        System.out.println(date);
        System.out.println(date.getTime());
        date.setTime(new Date().getTime());
        System.out.println(date);
        System.out.println(date.getTime());
    }
}
