package git_test3a;

import java.util.Arrays;
import java.util.Random;

public class Main {

    static int[] createArray(int size, int minValue, int maxValue) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(maxValue - minValue + 1) + 1;
        return a;
    }

    public static void main(String[] args) {
        int[] a = createArray(10, 1, 10);
        System.out.println(Arrays.toString(a));
    }
}
