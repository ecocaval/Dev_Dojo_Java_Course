package aula120LocalTime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23, 59, 59); // 23:59:59
        LocalTime time = LocalTime.now();
        System.out.println(localTime);
        System.out.println(time);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getDayOfMonth());
    }
}
