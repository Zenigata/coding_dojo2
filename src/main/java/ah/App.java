package ah;

import javax.naming.ldap.SortKey;

/**
 * Hello world!
 */
public final class App {
    public static Object convertor;

    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static boolean isLeap(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true; // étape 1 : année divisible par 400 = bissextile
        } // étape 2 : année divisible par 4 mais pas par 100 = bissextile
        return false;
    }

    public static String convert(int number) {
        String[] fromZeroToTwenty = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
                "nineteen", "twenty" };
        String[] theTens = { "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
        String[] theHundreds = { "hundred", "two hundred", "three hundred", "four hundred", "five hundred",
                "six hundred", "seven hundred", "eight hundred", "nine hundred" };

        if (cEstEntre31Et39(number)) {
            return theTens[number / 10 - 1] + " " + fromZeroToTwenty[number - 30];
        }
     
        if (cEstEntre21Et29(number)) {
            return fromZeroToTwenty[20] + " " + fromZeroToTwenty[number - 20];
        }

        if (cEstUneCentaine(number)) {
            return theHundreds[number / 100 - 1];
        }

        if (cEstUneDizaine(number)) {
            return theTens[number / 10 - 1];
        }

        return fromZeroToTwenty[number];
    }

    private static boolean cEstEntre31Et39(int number) {
        return number >= 31 && number <= 39;
    }

    private static boolean cEstEntre21Et29(int number) {
        return number >= 21 && number <= 29;
    }

    private static boolean cEstUneCentaine(int number) {
        return number >= 100;
    }

    private static boolean cEstUneDizaine(int number) {
        return number >= 30;
    }

}
