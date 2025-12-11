package Activities;

public class Activity6 {
    public static void run() {
        int[] arr = {3, 10, 15, 22, 9};
        int sum = 0, count = 0;

        for (int x : arr) {
            if (x % 2 != 0) {
                sum += x;
                count++;
            }
        }

        double avg = count > 0 ? (double) sum / count : 0;
    }
}
