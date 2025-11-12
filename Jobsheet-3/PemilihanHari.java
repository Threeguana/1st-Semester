import java.util.Scanner;

public class PemilihanHari {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName, dayType;

        System.out.print("Input day: ");
        dayName = sc.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                System.out.println(dayName + " is a " + dayType);
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                System.out.println(dayName + " is a " + dayType);
                break;
            default:
                System.out.println("invalid day name!");
                break;
        }
        sc.close();
    }
}
