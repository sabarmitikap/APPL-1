/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placingexceptionhandlers;
import java.util.Scanner;

/**
 *
 * @author Sabar
 */

public class ParseInts {
    public static void main(String[] args) {
    
    int val, sum=0;
    String line;
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a line of text");
    Scanner scanLine = new Scanner(scan.nextLine());

    while (scanLine.hasNext()) {

        try {
            val = Integer.parseInt(scanLine.next());
            sum += val;
        }
        catch (Exception e) {
        //Do Nothing
        }
    }
    System.out.println("The sum of the integers on this line is " + sum);
    }
}