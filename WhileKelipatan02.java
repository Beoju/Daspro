import java.util.Scanner;

public class WhileKelipatan02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int kelipatan = 0, jumlah = 0, counter = 0, i = 1;
        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = sc.nextInt();

        while (i <= 50) {
            if (i % kelipatan == 0){
                jumlah += 1;
                counter++;
            }
        }

    }
}
