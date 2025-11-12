import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("======= MENU KAFE JTI =======");
        System.out.println("-----------------------------");
        System.out.println("1. Kopi - Rp12000");
        System.out.println("2. Teh  - Rp7000");
        System.out.println("3. Roti - Rp20000");
        System.out.println("-----------------------------");

        System.out.print("Masukkan angka dari menu yang dipilih: ");
        int menu = sc.nextInt();
        sc.nextLine(); // bersihkan buffer

        System.out.print("Apakah punya member (y/n)? ");
        String member = sc.nextLine();

        double harga;
        switch (menu) {
            case 1 -> harga = 12000;
            case 2 -> harga = 7000;
            case 3 -> harga = 20000;
            default -> {
                System.out.println("Pilihan tidak valid!");
                sc.close();
                return;
            }
        }

        System.out.print("Banyak item: ");
        int jmlBeli = sc.nextInt();

        double diskon = member.equalsIgnoreCase("y") ? 0.10 : 0.0;
        double totBayar = harga * jmlBeli * (1 - diskon);

        System.out.println("-----------------------------");
        System.out.println("Harga per item : Rp" + harga);
        if (diskon > 0) {
            System.out.println("Mendapatkan diskon 10%");
        }
        System.out.println("Total bayar    : Rp" + totBayar);
        System.out.println("-----------------------------");

        sc.close();
    }
}
