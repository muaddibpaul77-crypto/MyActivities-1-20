package Activities;

public class Activity13 {
    public static void run() {
        int[] grades = {80, 50, 75, 90, 60};
        int pass = 0, fail = 0;

        for (int g : grades) {
            if (g >= 75) pass++;
            else fail++;
        }
    }
}
