package Soal3;

import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK: ");
        String nik = input.next();
        System.out.print("Masukkan Nama: ");
        String nama = input.next();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int gol = input.nextInt();
        System.out.print("Masukkan Status Pernikahan (1=Menikah, 2=Belum, 3=Cerai, 4=Menikah dan punya anak): ");
        int status = input.nextInt();
        System.out.print("Masukkan Jumlah Anak: ");
        int anak = input.nextInt();

        double gajiPokok = 0;
        switch (gol) {
            case 1: gajiPokok = 1200000; break;
            case 2: gajiPokok = 1500000; break;
            case 3: gajiPokok = 1750000; break;
            case 4: gajiPokok = 2000000; break;
            default: System.out.println("Kode golongan tidak valid."); return;
        }

        double tunjanganPasangan = 0;
        double tunjanganAnak = 0;

        if (status == 1 || status == 4) {
            tunjanganPasangan = 0.10 * gajiPokok;
        }
        if (status == 4 && anak > 0) {
            tunjanganAnak = 0.05 * gajiPokok * anak;
        }

        double gajiBersih = gajiPokok + tunjanganPasangan + tunjanganAnak;
        System.out.println("\nGaji Bersih Karyawan " + nama + " (" + nik + ") = Rp" + gajiBersih);
    }
}
