package Junit.RenaTest;

public class ComboString {
    public static String comboString(String a, String b){

        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }
}
