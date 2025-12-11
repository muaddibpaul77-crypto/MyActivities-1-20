package Activities;

public class Activity4 {
    public static void run() {
        int[] arr = {12, 5, 99, -3, 25};
        int smallest = arr[0];
        int largest = arr[0];

        for (int x : arr) {
            if (x < smallest) smallest = x;
            if (x > largest) largest = x;
        }
    }
}
