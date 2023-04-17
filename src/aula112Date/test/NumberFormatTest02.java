package aula112Date.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localePtBr = new Locale("pt", "BR");
        Locale localeJp = Locale.JAPAN;
        Locale localeIt = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localePtBr);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJp);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIt);

        double valueToFormat = 10_000.2929;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valueToFormat));
        }

        String valorString = "￥10,000";
        try {
            System.out.println(nfa[2].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
