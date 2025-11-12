import java.util.Scanner;

public class PemilihanBil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.print("Input angka: ");
        angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " adalah genap");
        } else {
            System.out.println("Angka " + angka + " adalah ganjil");
        }

        sc.close();
    }
}
