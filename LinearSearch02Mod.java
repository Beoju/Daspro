package Jobsheet8;

import java.util.Scanner;

public class LinearSearch02Mod {
    public static void main(String[] args) {
        // menambah scanner untuk deklarasi
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array: ");
        int elemen = sc.nextInt();


        int[] arrayInt = new int[elemen];

        System.out.println("Masukkan elemen array ");
        for (int i = 0 ; i < elemen; i++){
            System.out.println("ke-"+ (i));
           arrayInt[i] = sc.nextInt();
    
        }

       System.out.println("Masukkan yang ingin dicari: ");
       int key = sc.nextInt();

       int hasil = linearSearch(arrayInt, key);

       if (hasil != -1) {
        System.out.println("Key yang ada dalam array pada posisi indeks ke-"+hasil);
       } else {
        System.out.println("Key tidak ditemukan");
       }

    }
    public static int linearSearch(int[] arrayInt,int target){
        for (int i = 0; i<arrayInt.length; i++){
            if (arrayInt[i] == target) {
                return i;
                
            }
        }
        return -1;
    }
}
