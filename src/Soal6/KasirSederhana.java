package Soal6;

import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan total belanja (contoh 250000): Rp ");
        double total = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Punya kartu member? (Y/N): ");
        String jaw = sc.nextLine().trim().toUpperCase();
        boolean member = jaw.equals("Y");

        double diskon = 0;
        if (member) {
            if (total > 500000) diskon = 50000;
            else if (total > 100000) diskon = 15000;
        } else {
            if (total > 100000) diskon = 10000;
        }

        double bayar = total - diskon;
        if (bayar < 0) bayar = 0;

        System.out.println("\nTotal belanja : Rp " + (long) total);
        System.out.println("Diskon        : Rp " + (long) diskon);
        System.out.println("Total bayar   : Rp " + (long) bayar);

        System.out.print("\nMasukkan uang bayar: Rp ");
        double uang = sc.nextDouble();

        if (uang < bayar) {
            System.out.println("Uang kurang Rp " + (long)(bayar - uang));
        } else {
            System.out.println("Kembalian Rp " + (long)(uang - bayar));
        }

        sc.close();
    }
}
