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
        String[] fromZeroToTwenty = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        String[] theTens = {"ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
        String[] hundreds = { "hundred"};
        
        if (number == 100) {
            return hundreds[number / 100 - 1];
        }
       
        if (cEstUneDizaine(number)) {
            return theTens[number / 10 - 1];
        }
        
        return fromZeroToTwenty[number];
    }

    private static boolean cEstUneDizaine(int number) {
        return number >= 30;
    }

}
