import java.util.Scanner;

public class Harga_Bayar_Buku {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String merk, halaman;
        int harga, jumlah;
        double dis = 0.1, total, bayar, jmlDis;

        System.out.println("Masukkan Merk buku yang dibeli: ");
        merk = input.nextLine();

        System.out.println("Masukkan jumlah halaman: ");
        halaman = input.nextLine();

        System.out.println("Masukkan harga barang yang dibeli: ");
        harga = input.nextInt();

        System.out.println("Masukkan jumlah barang yang dibeli: ");
        jumlah = input.nextInt();
        
        total = harga*jumlah;
        jmlDis = total*dis;
        bayar = total - jmlDis;
        
        System.out.println("Merk buku: " + merk);
        System.out.println("Diskon: " + dis);
        System.out.println("Jumlah halaman buku: "+ halaman);
        System.out.println("Diskon yang anda dapatkan adalah: " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah: " + bayar);
    }
}
