import java.util.Scanner;

public class ForKelipatan02 {

    public static void main(String[] args) {
        Scanner scan02 = new Scanner (System.in);
         
        int kelipatan = 0, jumlah = 0, counter = 0;
        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan02.nextInt();

    for (int i =1; i <= 50; i++)
        if (i % kelipatan == 0) {
            jumlah += i;
            counter++;
        }
        System.out.printf("Banyaknya %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);

    }
}