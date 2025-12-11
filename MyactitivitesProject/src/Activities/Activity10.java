package Activities;

public class Activity10 {
    public static void run() {
        int[] arr = {9, 7, 3, 14, 5};
        int index = -1;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 0) {
                index = i;
                break;
            }
    }
}
