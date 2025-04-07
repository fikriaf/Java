/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Fikri
 */
import java.util.Scanner;

public class latihanDasar {
    public static void main(String args[]) {
        // Variabel
        String nama = "Halo";
        int angka = 123;
        float pecahan = 19.99f;
        char karakter = 'A';
        boolean status = true;

        // Deklarasi (Membuat) Variabel
        int umur;
        umur = 25;

        int usia = 30;
        usia = 35; // Nilai usia diubah

        final int TAHUN_LAHIR = 2000;

        // Menampilkan Variabel
        System.out.println(nama);
        System.out.println("Umur: " + umur);

        // Menggabungkan teks dan variabel
        String firstName = "John";
        String lastName = "Doe";
        System.out.println("Nama: " + firstName + " " + lastName);

        // Menjumlahkan variabel numerik
        int x = 5;
        int y = 6;
        System.out.println(x + y); // Output: 11

        // Java Identifiers
        int totalVolume;
        int _angka;
        int $uang;

        // Java Type Casting
        // Widening Casting (otomatis)
        int myInt = 9;
        double myDouble = myInt; // Implicit casting
        System.out.println(myInt);
        System.out.println(myDouble);

        // Narrowing Casting (manual)
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Explicit casting
        System.out.println(myDouble2);
        System.out.println(myInt2);

        // Java Operators
        int a = 10, b = 5;
        System.out.println(a + b); // 15

        // Java Assignment Operators
        int z = 10;
        z += 5; // z sekarang 15

        // Java Conditions and If Statements
        if (a > b) {
            System.out.println("a lebih besar dari b");
        } else {
            System.out.println("b lebih besar atau sama dengan a");
        }

        // Java While Loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Java Do While Loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        // Java For Loop
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }

        // Java Arrays
        String[] mobil = {"BMW", "Toyota", "Honda"};
        int[] angkaArray = {10, 20, 30};

        // Mengakses Elemen dalam Array
        System.out.println(mobil[0]); // BMW

        // Mengubah nilai elemen array
        mobil[1] = "Mercedes";
        System.out.println(mobil[1]); // Mercedes

        // Loop dalam Sebuah Array
        for (String m : mobil) {
            System.out.println(m);
        }

        // Multidimensional Arrays
        int[][] angka2D = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(angka2D[1][2]); // 6

        // Scanner untuk Masukan Pengguna
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String inputNama = scanner.nextLine();
        System.out.println("Halo, " + inputNama);

        // Jenis Input dengan Scanner
        System.out.print("Masukkan angka: ");
        int inputAngka = scanner.nextInt();
        System.out.println("Angka yang dimasukkan: " + inputAngka);
    }
}
