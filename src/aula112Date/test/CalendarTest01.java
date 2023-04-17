package aula112Date.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
//        System.out.println(c.);
        Date date = c.getTime();
        System.out.println(date);
        date.setTime(10000L);
        System.out.println(date);
    }
}
