import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlTabunganAwal;
        int lamaMenabung;
        double jmlTabunganAkhir;
        double bunga;
        double presentaseBunga = 0.02;

        System.out.print("Masukkan tabungan awal: ");
        jmlTabunganAwal = sc.nextInt();
        System.out.print("Masukkan lama menabung: ");
        lamaMenabung = sc.nextInt();

        bunga = lamaMenabung * presentaseBunga * jmlTabunganAwal;
        jmlTabunganAkhir = bunga + jmlTabunganAwal;

        System.out.print("Tabungan akhir anda   :" + jmlTabunganAkhir);

        sc.close();
    }
}
