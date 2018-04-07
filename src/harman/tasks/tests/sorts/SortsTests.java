package harman.tasks.tests.sorts;

import harman.tasks.sorts.Task1;
import harman.tasks.sorts.Task2;
import harman.tasks.sorts.Task3;
import harman.tasks.sorts.Task4;
import harman.tasks.sorts.Task5;

import java.util.Arrays;

public class SortsTests {
    public void testStatus(String taskName, boolean test) {
        String status = test ? "Test done" : "Test failed";
        System.out.printf("%s: %s\n", taskName, status);
    }

    public boolean testTask1() {
        Task1 task1 = new Task1();
        int[] result = task1.sortThreeValues(5, 2, 0);
        int[] expect = new int[] {0, 2, 5};
        return Arrays.equals(result, expect);
    }

    public boolean testTask2() {
        Task2 task2 = new Task2();
        int result = task2.findMaxElem(new int[] {-2, -5, -1, -9});
        int expect = -1;
        return result == expect;
    }

    public boolean testTask3() {
        Task3 task3 = new Task3();
        int result = task3.findMaxElemByStream(new Integer[] {-2, -5, -1, -9});
        int expect = -1;
        return result == expect;
    }

    public boolean testTask4() {
        Task4 task4 = new Task4();
        int[] result = task4.sortArray(new int[] {-2, -5, 0 ,-1, -9});
        int[] expect = new int[] {-9, -5, -2, -1, 0};
        return Arrays.equals(result, expect);
    }

    public boolean testTask5() {
        Task5 task5 = new Task5();
        int[] firstArray = new int[] {1, 2, 3};
        int[] secondArray = new int[] {1, 2, 3, 4};
        int result = task5.compareTwoArrays(firstArray, secondArray);
        int expect = -1;
        return result == expect;
    }

    public static void main(String[] args) {
        SortsTests stringsTests = new SortsTests();

        stringsTests.testStatus("Task1", stringsTests.testTask1());
        stringsTests.testStatus("Task2", stringsTests.testTask2());
        stringsTests.testStatus("Task3", stringsTests.testTask3());
        stringsTests.testStatus("Task4", stringsTests.testTask4());
        stringsTests.testStatus("Task5", stringsTests.testTask5());
    }
}
