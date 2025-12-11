package Activities;

public class Activity2 {
    public static void run() {
        int[] arr = {3, 7, 1, 7, 9, 7, 2, 4, 7, 10};
        int count = 0;

        for (int x : arr)
            if (x == 7) count++;

        System.out.println("Count of 7: " + count);
    }
}
