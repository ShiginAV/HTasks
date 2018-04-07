package harman.tasks.arrays;

public class Task4 {
    public double getAverage(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}
