import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tahun;

        System.out.print("Input tahun: ");
        tahun = sc.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0 || tahun % 400 == 0) {
                System.out.println(tahun + " adalah tahun kabisat");
            } else {
                System.out.println(tahun + " bukan tahun kabisat");
            }
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }
        sc.close();
    }
}
