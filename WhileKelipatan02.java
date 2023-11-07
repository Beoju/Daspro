import java.util.Scanner;

public class WhileKelipatan02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n, i = 1;
        float jml = 0 ,x, rata;
        System.out.println("Banyaknya Data: ");
        n = sc.nextInt();

        while (i <= n) {
            System.out.print("Data ke-"+i+": ");
            x = sc.nextFloat();
            jml += x;
            i++;
        }
        rata = jml / n;
        System.out.println("Rata - rata: " + rata);
        System.out.println("Jumlah: " + jml);

    }
}
