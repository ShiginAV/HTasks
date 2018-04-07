package harman.tasks.tests.arrays;

import harman.tasks.arrays.*;

public class ArraysTests {
    public void testStatus(String taskName, boolean test) {
        String status = test ? "Test done" : "Test failed";
        System.out.printf("%s: %s\n", taskName, status);
    }

    public boolean testTask1() {
        Task1 task1 = new Task1();
        char[] array = new char[] {'1', '2', '3'};
        long result = task1.calculateSumOfCharArray(array);
        long expect = 6L;
        return result == expect;
    }

    public boolean testTask2() {
        Task2 task2 = new Task2();
        int[] array = new int[] {4, 8, 6, 1, 2, 9, 4};
        int result = task2.findMinDistance(array);
        int expect = 3;
        return result == expect;
    }

    public boolean testTask3() {
        Task3 task3 = new Task3();
        task3.printMultTable(3);
        return true;
    }

    public boolean testTask4() {
        Task4 task4 = new Task4();
        int[] array = new int[] {23, 6, 47, 35, 2, 13};
        double result = task4.getAverage(array);
        double expect = 21D;
        return result == expect;
    }

    public boolean testTask5() {
        Task5 task5 = new Task5();
        int[] array = new int[] {23, 6, 47, 35, 2, 13};
        double result = task5.getAverageByStream(array);
        double expect = 21D;
        return result == expect;
    }


    public static void main(String[] args) {
        ArraysTests arraysTests = new ArraysTests();

        arraysTests.testStatus("Task1", arraysTests.testTask1());
        arraysTests.testStatus("Task2", arraysTests.testTask2());
        arraysTests.testStatus("Task3", arraysTests.testTask3());
        arraysTests.testStatus("Task4", arraysTests.testTask4());
        arraysTests.testStatus("Task5", arraysTests.testTask5());
    }
}
