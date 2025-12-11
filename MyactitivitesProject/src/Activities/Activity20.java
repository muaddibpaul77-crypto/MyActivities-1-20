package Activities;

public class Activity20 {
    public static void run() {
        int[] arr = {10, 22, 30, 17, 40};
        for (int x : arr)
            if (x % 2 == 0 && x > 20)
                System.out.println(x);
    }
}
