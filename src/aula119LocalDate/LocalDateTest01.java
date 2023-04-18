package aula119LocalDate;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2021, Month.FEBRUARY, 15);
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());

        System.out.println(localDate.lengthOfMonth());

        System.out.println(localDate.isLeapYear());

        LocalDate localDate1 = LocalDate.now();

        System.out.println(localDate1.plusDays(2));
        System.out.println(localDate1.plusMonths(2));

    }
}
