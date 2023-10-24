import java.util.Scanner;

public class PemilihanPercobaan3NoAbsen {
    public static void main(String args[]) {
        Scanner input00 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = input00.nextDouble();
        System.out.print("Masukkan kedua pertama: ");
        angka2 = input00.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = input00.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
            // tambahanku dewe
            default:
                System.out.println("Operator tidak ditemukan");
                // break digunakan untuk menghentikan eksekusi dalam sebuah case di dalam switch
                // statement, sehingga tidak ada case berikutnya yang dijalankan setelahnya.
                // default adalah bagian yang dieksekusi jika tidak ada case yang cocok dengan
                // nilai ekspresi yang diperiksa dalam switch statement, berfungsi sebagai opsi
                // terakhir atau fallback jika tidak ada pilihan yang sesuai.

                // Kode operator = input00.next().charAt(0); mengambil input dari user
                // menggunakan objek Scanner, kemudian mengambil karakter pertama dari input
                // tersebut dan menyimpannya dalam variabel operator.
        }
    }
}
