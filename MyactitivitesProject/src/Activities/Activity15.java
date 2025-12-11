package Activities;
import java.util.Scanner;

public class Activity15 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int x : arr)
            if (x > 50) System.out.println(x);
    }
}
