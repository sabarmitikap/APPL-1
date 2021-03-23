/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package throwingexceptions;
import java.util.Scanner;

/**
 *
 * @author Sabar
 */

public class Factorials {
    public static void main(String[] args) {
    String keepGoing = "y";
    Scanner scan = new Scanner(System.in);
    
    while (keepGoing.equals("y") || keepGoing.equals("Y")) {
        System.out.print("Enter an integer: ");
        int val = scan.nextInt();
            try {
                if (val < 0) {
                    throw new IllegalArgumentException("Value tidak boleh negatif");
                }
                else if (val > 16) {
                    throw new IllegalArgumentException("Value tidak boleh lebih dari 16");
                }
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
            }                
            catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException("Inputan tidak boleh bernilai negatif");
            }
        System.out.print("Another factorial? (y/n) ");
        keepGoing = scan.next();
    }
}
}
