package primaputraagusantara;

import java.util.Scanner;

public class Main
{
    static Scanner input = new Scanner(System.in);

    //method tanpa nilai balik dan tanpa parameter
    public static void hitungLuasSegitiga()
    {
        int alas, tinggi;
        double luas;

        System.out.print("Masukkan Alas = ");
        alas = input.nextInt();

        System.out.print("Masukkan Tinggi = ");
        tinggi = input.nextInt();
        
        //PROSES
        luas = (double) (alas * tinggi) / 2;

        //OUTPUT
        System.out.println("Luas Segitiga adalah " + luas + " cm");
    }

    public static void main(String[] args) //method utama
    {
        hitungLuasSegitiga();

    }


}
