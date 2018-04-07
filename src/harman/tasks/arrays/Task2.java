package harman.tasks.arrays;

public class Task2 {
    public int findMinDistance(int[] array) {
        int minDist = -1;
        int index = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int dist = Math.abs(array[i] - array[i + 1]);
            if (dist < minDist || minDist == -1) {
                minDist = dist;
                index = i;
            }
        }
        return index;
    }
}
