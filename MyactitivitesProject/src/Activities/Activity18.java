package Activities;

public class Activity18 {
    public static void run() {
        int[] arr = {3, 5, 2, 3, 8};
        boolean dup = false;

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j]) {
                    dup = true;
                    break;
                }
    }
}
