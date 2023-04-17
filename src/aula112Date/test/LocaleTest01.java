package aula112Date.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {

        Locale locale = new Locale("pt", "br");
        Locale localePt = new Locale("pt", "pt");
        Locale localeIt = new Locale("it", "it");
        Locale localeIndia = new Locale("hi", "in");
        Locale localeJapao = new Locale("ja", "jp");
        Locale localeHolanda = new Locale("nl", "nl");

        Calendar calendar = Calendar.getInstance();

        DateFormat dateTest = DateFormat.getDateInstance(DateFormat.FULL, locale);
        DateFormat dateTestPt = DateFormat.getDateInstance(DateFormat.FULL, localePt);
        DateFormat dateTestIt = DateFormat.getDateInstance(DateFormat.FULL, localeIt);
        DateFormat dateTestIndia = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateTestJapao = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat dateTestHolanda = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println(localeIt.getDisplayCountry(locale));
        System.out.println(localeHolanda.getDisplayCountry(locale));
        System.out.println(localeIt.getDisplayCountry());
        System.out.println(localeHolanda.getDisplayCountry());

        System.out.println(dateTest.format(calendar.getTime()));
        System.out.println(dateTestPt.format(calendar.getTime()));
        System.out.println(dateTestIt.format(calendar.getTime()));
        System.out.println(dateTestIndia.format(calendar.getTime()));
        System.out.println(dateTestJapao.format(calendar.getTime()));
        System.out.println(dateTestHolanda.format(calendar.getTime()));
    }
}
