import java.util.Scanner;

public class Segitiga02 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        int alas, tinggi;
        float luas;
         System.out.println("Masukkan alas: ");
         alas = scanner.nextInt();
         System.out.println("Masukkan tinggi:  ");
         tinggi = scanner.nextInt();
         luas = 0.5f * alas * tinggi;
         System.out.println("Luas Segitiga" + luas);                                     
    }
}