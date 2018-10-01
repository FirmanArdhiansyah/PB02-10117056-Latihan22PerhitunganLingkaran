
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nama : Firman Ardhiansyah 
 *         Kelas : IF-2 (PB02) 
 *         NIM : 10117056
 */
public class PB0210117056Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String d; //validasi
        double diameter;
        double r;
        double L;
        double K;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("======Perhitungan Lingkaran======");
        
        do {            
            System.out.print("Masukkan nilai diameter lingkaran : ");
            d = scn.nextLine();
            //validasi input
            System.out.println((!d.matches("[0-9]*"))
                    ?"Nilai Diameter Tidak Sesuai\n":"");

        } while (!d.matches("[0-9]*"));
        
        System.out.println("\n======Hasil Perhitungan Lingkaran======");
        //konversi string ke double
        diameter = Double.parseDouble(d); 
        
        r = diameter/2;
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",r);
        L = Math.PI*r*r;
        System.out.printf("Luas Lingkaran = %.2f cm %n",L);
        K = 2*Math.PI*r;
        System.out.printf("Keliling Lingkaran = %.2f cm %n",K);
    }
    
}
