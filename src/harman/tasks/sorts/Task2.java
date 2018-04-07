package harman.tasks.sorts;

public class Task2 {
    public int findMaxElem(int[] array) {
        int maxElem = array[0];
        for (int element : array) {
            if (element > maxElem) {
                maxElem = element;
            }
        }
        return maxElem;
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println(task2.findMaxElem(new int[] {-1, -5, -2, -7, -10}));
    }
}
