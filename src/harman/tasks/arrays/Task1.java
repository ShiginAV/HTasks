package harman.tasks.arrays;

public class Task1 {
    public long calculateSumOfCharArray(char[] array) {
        long sum = 0;
        for (char digit : array) {
            sum += Character.getNumericValue(digit);
        }
        return  sum;
    }
}
