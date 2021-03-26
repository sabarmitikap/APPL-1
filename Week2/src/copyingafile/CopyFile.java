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
        
        System.out.println("Masukan Nama File '.txt' : ");
        String fileName = new Scanner(System.in).nextLine();      
        
        try {
            File fileLoc = new File("D:\\Java\\" + fileName);
            Scanner hasil = new Scanner(fileLoc);
            while (hasil.hasNextLine()) {
                    System.out.println(hasil.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.print("File Tidak Ada!!!\n");
        }
        }
    }