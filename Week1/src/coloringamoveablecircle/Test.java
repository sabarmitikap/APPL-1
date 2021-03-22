/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coloringamoveablecircle;

/**
 *
 * @author Sabar
 */
import java.util.Scanner;

public class Test{

    public static void main (String[]args){

        int jam_parkir,b_parkir,kendaraan = 0;

        int motor = 2000;

        int motor2 = 1000;

        int mobil = 3000;

        int mobil2 = 2000;

        System.out.println ("pilih kendaraan anda");

        System.out.println ("1.Motor");

        System.out.println ("2.Mobil");

        System.out.println ("Masukan Pilihan: ");
        Scanner input = new Scanner (System.in);
        kendaraan = input.nextInt();

        if (kendaraan == 1){

            System.out.println ("Biaya perjamnya adalah Rp 2000 + 1000 jam berikutnya");

            System.out.println ("Lama Parkir");

            jam_parkir = input.nextInt();

            if (jam_parkir == 1){

                b_parkir = motor;
            }
            else if (jam_parkir > 2){

                b_parkir = jam_parkir * motor2 + motor - 1000;

                System.out.println ("maka anda harus membayar"+b_parkir);
            }
        }

        if (kendaraan == 2){
            System.out.println ("Biaya perjamnya adalah Rp 3000 + 2000 jam berikutnya");

            System.out.println ("Lama Parkir");

            jam_parkir = input.nextInt();

            if (jam_parkir == 1){

                b_parkir = mobil;
            }
            else if (jam_parkir > 2){

                b_parkir = jam_parkir * mobil2 + mobil - 2000;

                System.out.println ("maka anda harus membayar"+b_parkir);
            }
        }
    }

}
