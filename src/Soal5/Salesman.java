package Soal5;

import java.util.Scanner;

public class Salesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double penjualan, uangJasa, komisi, totalPendapatan;

        System.out.print("Masukkan total penjualan hari ini: Rp ");
        penjualan = input.nextDouble();

        
        if (penjualan <= 2000000) {
            uangJasa = 100000;
            komisi = penjualan * 0.10;
        } else if (penjualan <= 5000000) {
            uangJasa = 200000;
            komisi = penjualan * 0.15;
        } else {
            uangJasa = 300000;
            komisi = penjualan * 0.20;
        }

        totalPendapatan = uangJasa + komisi;

        
        System.out.println("\n=== Rincian Pendapatan Sales ===");
        System.out.println("Penjualan hari ini  : Rp " + penjualan);
        System.out.println("Uang jasa           : Rp " + uangJasa);
        System.out.println("Komisi              : Rp " + komisi);
        System.out.println("--------------------------------");
        System.out.println("Total pendapatan    : Rp " + totalPendapatan);

        input.close();
    }
}
