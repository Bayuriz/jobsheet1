/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
    public class PilihanKondisi {
        public static void main (String[] args){
        Scanner masukan = new Scanner(System.in);
        System.out.print("Silakan pilih angka 1 - 3 :");
        int bil = masukan.nextInt();
        switch (bil){
            case 1 : System.out.println("Satu");
                    break;
            case 2 : System.out.println("Dua");
                    break;
            case 3 : System.out.println("Tiga");}
    }
}
