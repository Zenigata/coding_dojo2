package ah;

/**
 * Hello world!
 */
public final class App {
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
    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
    return true; //  étape 1 : année divisible par 400 = bissextile 
    }  // étape 2 : année divisible par 4 mais pas par 100 = bissextile
    return false;
    }

} 
