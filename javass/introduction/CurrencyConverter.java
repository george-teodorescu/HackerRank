package introduction;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConverter {

    NumberFormat nf;

    public String currencyConverter(double amount) {
        nf = NumberFormat.getCurrencyInstance(Locale.US);
        String s1 = "US: " + nf.format(amount);
        nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String s2 = "India: " + nf.format(amount);
        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String s3 = "China: " + nf.format(amount);
        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String s4 = "France: " + nf.format(amount);
        return s1 + "\n" + s2 + "\n" + s3 + "\n" + s4;
    }

    public static void main(String[] args) {
        CurrencyConverter cc = new CurrencyConverter();
        cc.currencyConverter(152131.5421);
    }
}
