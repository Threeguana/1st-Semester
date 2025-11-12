import java.util.Scanner;

public class PemilihanSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, hasil = 0;
        char operator;

        System.out.print("Masukkan angka pertama : ");
        x = sc.nextDouble();
        System.out.print("Masukkan angka kedua   : ");
        y = sc.nextDouble();

        System.out.print("Masukkan operator      : ");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = x + y;
                break;
            case '-':
                hasil = x - y;
                break;
            case '/':
                hasil = x / y;
                break;
            case '*':
                hasil = x * y;
                break;
            case '%':
                hasil = x % y;
                break;
            default:
                System.out.println("operator tidak valid!");
                break;
        }

        System.out.println("hasil dari " + x + " " + operator + " " + y + " adalah " + hasil);
        sc.close();
    }
}
