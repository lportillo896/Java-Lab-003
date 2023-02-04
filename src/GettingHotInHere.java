/**
 *
 * @author Trevor Hartman
 * @author Logan Portillo
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int number = scanner.nextInt();
        float celsius = (number - 32.0f) * (5.0f/9.0f);
        int con = (int)celsius;
        System.out.println(number + "`F");
        System.out.println(celsius + "`C");
        System.out.println(con + "`C");
        System.out.println("If it were 2`C warmer it would be: " + (2 + celsius) + "`C");
    }
}
