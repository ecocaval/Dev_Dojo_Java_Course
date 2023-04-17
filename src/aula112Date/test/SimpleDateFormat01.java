package aula112Date.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";

        String customPattern = "'Brasil' dd 'de' MMMM 'de' yyyy";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(customPattern);

        System.out.println(simpleDateFormat.format(new Date()));
        System.out.println(simpleDateFormat2.format(new Date()));
    }
}
