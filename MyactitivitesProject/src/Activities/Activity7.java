package Activities;

public class Activity7 {
    public static void run() {
        int[] arr = {-5, 12, -3, 9};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0) arr[i] *= -1;
    }
}
