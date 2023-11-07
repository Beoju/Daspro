import java.util.Scanner;

public class WhileGaji02 {
    
    public static void main(String[] args) {
        Scanner gaji = new Scanner(System.in);
         int jmlKaryawan, jmlJamLembur;
         double gajiLembur = 0, totGajiLembur = 0;
         String jabatan;

         System.out.println("Masukkan jumlah karyawan: ");
         jmlKaryawan = gaji.nextInt();

         int i = 0;

         while (i < jmlKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan, Pegawai"); //memberi variabel baru "Pegawai"
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = gaji.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jmlJamLembur = gaji.nextInt();
            i++;
            
            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")){
                gajiLembur = jmlJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur = jmlJamLembur * 75000;
                
            // menambahkan perulangan untuk variabel "pegawai" dengan permisalan gaji lembur perjam 50000
            } else if (jabatan.equalsIgnoreCase("pegawai")){
                gajiLembur = jmlJamLembur * 50000; 
            }

            totGajiLembur += gajiLembur;
            System.out.println("Total gaji lembur: " + totGajiLembur);
         }

    }
}
