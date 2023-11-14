package Jobsheet8;

import java.util.Scanner;

public class ArrayRataNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        // menambahkan variabel untuk memunculkan output jumlah mahasiswa
        System.out.println("Masukkan jumlah mahasiswa: ");
        int mhsw = sc.nextInt();
        
        // mengganti jumlah array dengan "mhsw" untuk memunculkan output jumlah mahasiswa sesuai yang diminta user
        int[] nilaiMhs = new int[mhsw];
        double total = 0, rata2;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.println("Masukkan nilai mahasiswa ke- "+ (i+1) +": " );
            nilaiMhs[i] = sc.nextInt();

        }
        for (int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];

        }
        rata2 = total/nilaiMhs.length;
        // memberikan fungsi if dan else untuk rata - rata nilai lulus dan tidak lulus
        if (rata2 > 70) {
            System.out.println("Rata - rata nilai lulus = "+ rata2);
            
        }else  {
            System.out.println("Rata - rata nilai tidak lulus = "+62.5);
        }
    }

}
