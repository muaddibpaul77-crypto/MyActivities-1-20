package Activities;

public class Activity17 {
    public static void run() {
        int[] arr = {10, 50, 20, 80, 40};
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > highest) {
                second = highest;
                highest = x;
            } else if (x > second && x != highest) {
                second = x;
            }
        }
    }
}
