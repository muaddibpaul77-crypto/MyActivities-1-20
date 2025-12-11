package Activities;

public class Activity12 {
    public static void run() {
        int[] arr = {5, 7, 5, 1, 5, 3};
        int occ = 0;

        for (int x : arr) {
            if (x == 5) occ++;
            if (occ == 3) break;
        }
    }
}
