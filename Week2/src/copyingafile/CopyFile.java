/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyingafile;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

/**
 *
 * @author Sabar
 */

public class CopyFile {
    public static void main(String[] args) {
        String keepFinding = "y";
        Scanner scan = new Scanner(System.in);
        
        while (keepFinding.equals("y") || keepFinding.equals("Y")){
            System.out.println("Enter the name of the file (must include with '.txt' : ");
        try {
            String fileName = new Scanner(System.in).nextLine();
            File fileLoc = new File("D:\\Java\\" + fileName);   
            Scanner hasil = new Scanner(fileLoc); 
            while (hasil.hasNextLine()) {
                    System.out.println(hasil.nextLine());
            }
            break;
        }catch (FileNotFoundException e){
            System.out.print("File does not exist\n");
        }
        
        System.out.print("Wanna keep looking? (y/n) ");
        keepFinding = scan.next();
        }
    }
}
