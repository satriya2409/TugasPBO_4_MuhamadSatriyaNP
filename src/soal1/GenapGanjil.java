package soal1;

import java.util.Scanner;


public class GenapGanjil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bil = input.nextInt();

        if (bil % 2 == 0) {
            System.out.println("Bilangan " + bil + " adalah genap.");
        } else {
            System.out.println("Bilangan " + bil + " adalah ganjil.");
        }
    }
    
    
}