package Activities;
import java.util.Scanner;

public class Activity9 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int sum = 0, num;

        do {
            System.out.print("Enter a number (0 stops): ");
            num = sc.nextInt();
            sum += num;
        } while (num != 0);
    }
}
