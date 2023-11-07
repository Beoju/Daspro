import java.util.Scanner;

public class WhileKelipatan02 {

    public static void main(String[] args) {
        Scanner scan02 = new Scanner(System.in);

        int kelipatan = 0, jumlah = 0, counter = 0;
        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan02.nextInt();

        int i = 1; // Inisialisasi nilai i di luar loop
        while (i <= 50) { // Ganti loop for dengan while
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            i++; // Perbarui nilai i setiap iterasi
            double rataRata = (double) jumlah / counter; // Hitung rata-rata
        }
        System.out.printf("Banyaknya %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
    }
}
