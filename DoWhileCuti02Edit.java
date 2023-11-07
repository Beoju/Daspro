import java.util.Scanner;

public class DoWhileCuti02Edit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jmlHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jmlHari = sc.nextInt();

                if (jmlHari <= jatahCuti) {
                    jatahCuti -= jmlHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    // Tidak ada break di sini, program akan terus berlanjut
                }
            } else {
                break; // Keluar dari perulangan jika pengguna memilih "t"
            }
        } while (true); // Tetap berjalan tanpa memeriksa jatahCuti
    }
}
