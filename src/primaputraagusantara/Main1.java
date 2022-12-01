package primaputraagusantara;

import java.util.Scanner;

public class Main1
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        char pilih = 0;
        String ulang = null;

        do {
            System.out.println();
            System.out.println("1. Segitiga");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Trapesium");
            System.out.println("5. Jajargenjang");
            System.out.println("-----------------------");

            System.out.print("Pilih Menu = ");
            pilih = input.next().charAt(0);

            switch (pilih)
            {
                case '1' :
                {
                    luasSegitiga();
                    break;
                }

                case '2' :
                {
                    luasPersegiPanjang();
                    break;
                }

                case '3' :
                {
                    luasLingkaran();
                    break;
                }

                case '4' :
                {
                    luasTrapesium();
                    break;
                }

                case '5' :
                {
                    luasJajargenjang();
                    break;
                }

            }

            System.out.print("Apakah Anda ingin Mengulang = ");
            ulang = input.next();
        } while (ulang.equalsIgnoreCase("ya"));


    }

    public static void luasSegitiga()
    {
        int alas, tinggi;
        double luas;

        System.out.print("Masukkan Alas = ");
        alas = input.nextInt();

        System.out.print("Masukkan Tinggi = ");
        tinggi = input.nextInt();

        luas = (double)(alas * tinggi) / 2;
        System.out.println("Luas Segitiga Adalah " + luas + "cm");
    }

    public static void luasPersegiPanjang()
    {
        int panjang, lebar, luas;
        System.out.println();
        System.out.print("Masukkan Panjang Persegi = ");
        panjang = input.nextInt();

        System.out.print("Masukkan Lebar Persegi = ");
        lebar = input.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas Persegi Adalah " + luas + "cm");
    }

    public static void luasLingkaran()
    {
        int jari2 = 0;
        double luas;
        System.out.println();
        System.out.print("Masukkan Jari - Jari Lingkaran = ");
        jari2 = input.nextInt();
        luas = (double)3.14 * (jari2 * jari2);
        System.out.println("Luas Lingkaran Adalah " + luas + "cm");
    }

    public static void luasTrapesium()
    {
        int sisiSejajarA, tinggi, sisiSejajarB;
        double luas;

        System.out.println();
        System.out.print("Masukkan Panjang Sisi Sejajar A = ");
        sisiSejajarA = input.nextInt();

        System.out.print("Masukkan Panjang Sisi Sejajar B = ");
        sisiSejajarB = input.nextInt();

        System.out.print("Masukkan Tinggi = ");
        tinggi = input.nextInt();

        luas = (double)(tinggi * (sisiSejajarA + sisiSejajarB))/2;
        System.out.println("Luas Trapesium Adalah = " + luas + "cm");
    }

    public static void luasJajargenjang()
    {
        int alas, tinggi, luas;

        System.out.println();
        System.out.print("Masukkan Alas Jajargenjang = ");
        alas = input.nextInt();

        System.out.print("Masukkan Tinggi Jajargenjang = ");
        tinggi = input.nextInt();

        luas = alas * tinggi;
        System.out.println("Luas Jajargenjang Adalah " + luas + "cm");
    }
}
