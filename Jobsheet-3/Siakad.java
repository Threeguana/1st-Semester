import java.util.Scanner;

public class Siakad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte absen;
        char kelas;
        String nama, nim;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        String kualifikasi = null;
        boolean valid = true;

        System.out.print("Masukkan nama     : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM      : ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas    : ");
        kelas = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Masukkan absen    : ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai tugas    : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai kuis     : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai ujian    : ");
        nilaiUjian = sc.nextDouble();

        if (nilaiTugas < 0 || nilaiKuis < 0 || nilaiUjian < 0 || nilaiTugas > 100 || nilaiKuis > 100
                || nilaiUjian > 100) {
            valid = false;
            System.out.println("Nilai tidak valid!");
        }

        if (valid) {
            nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                kualifikasi = "Sangat Baik";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                kualifikasi = "Lebih dari Baik";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                kualifikasi = "Baik";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                kualifikasi = "Lebih dari Cukup";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                kualifikasi = "Cukup";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                kualifikasi = "Kurang";
            } else {
                kualifikasi = "Gagal";
            }

            System.out.println("\nMahasiswa dengan nama " + nama);
            System.out.println("NIM             : " + nim);
            System.out.println("Kelas           : " + kelas);
            System.out.println("Absen           : " + absen);
            System.out.println("Nilai Akhir     : " + nilaiAkhir);
            System.out.println("kualifikasi     : " + kualifikasi);
        } else {
            System.out.println("Tidak dapat menghitung nilai");
        }
        sc.close();
    }
}
