package Activities;
import java.util.Scanner;

public class Activity16 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        int temp = Math.abs(n);

        while (temp > 0) {
            temp /= 10;
            count++;
        }
    }
}
