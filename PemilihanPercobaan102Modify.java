import java.util.Scanner;

public class PemilihanPercobaan1NoAbsen {
    public static void main(String args[]) {
        Scanner input00 = new Scanner(System.in);

        System.out.println("Masukkan angka: ");

        int angka = input00.nextInt();

        // contoh:
        // if (angka % 2 == 0) {
        // System.out.println("Angka " + angka + " bilangan genap");
        // } else {
        // System.out.println("Angka " + angka + " bilangan ganjil");
        // }

        // tugas ternary operator
        String result = (angka % 2 == 0) ? "Angka " + angka + " bilangan genap" : "Angka " + angka + " bilangan ganjil";
        System.out.println(result);

        // Operator ternary adalah bentuk singkat dari pernyataan if-else yang
        // digunakan. Operator ternary memiliki format: (kondisi) ? nilai_true :
        // nilai_false. Operator ini cocok digunakan dalam kasus seperti ini karena
        // menghasilkan kode yang lebih ringkas dan efisien. Dalam satu baris kode,
        // operator ternary dapat menggantikan pernyataan if-else, menjadikannya pilihan
        // yang baik ketika kita hanya perlu melakukan pengecekan sederhana dan
        // mengembalikan nilai atau melakukan tindakan berdasarkan hasil pengecekan
        // tersebut.

    }
}