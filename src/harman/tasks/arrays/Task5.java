package harman.tasks.arrays;

import java.util.Arrays;

public class Task5 {
    public double getAverageByStream(int[] array) {
        return Arrays.stream(array).average().getAsDouble();
    }
}
