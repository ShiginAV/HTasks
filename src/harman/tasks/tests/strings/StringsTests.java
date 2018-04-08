package harman.tasks.tests.strings;

import harman.tasks.strings.Task1;
import harman.tasks.strings.Task2;
import harman.tasks.strings.Task3;
import harman.tasks.strings.Task4;
import harman.tasks.strings.Task5;

public class StringsTests {
    public void testStatus(String taskName, boolean test) {
        String status = test ? "Test done" : "Test failed";
        System.out.printf("%s: %s\n", taskName, status);
    }

    public boolean testTask1() {
        Task1 task1 = new Task1();
        char result = task1.getCharacterByIndex("Hello World", 6);
        char expect = 'W';
        return result == expect;
    }

    public boolean testTask2() {
        Task2 task2 = new Task2();
        return task2.isContainsSequenceOfChar("Hello", new char[] {'H', 'e', 'l', 'l', 'o'});
    }

    public boolean testTask3() {
        Task3 task3 = new Task3();
        String result = task3.getInitials("Ivan", "Petrov");
        String expect = "I.P.";
        return result.equals(expect);
    }

    public boolean testTask4() {
        Task4 task4 = new Task4();
        return task4.isAnagram("Internet", "Tine Rent");
    }

    public boolean testTask5() {
        Task5 task5 = new Task5();
        int result = task5.convertHexStringToDecInt("0xff");
        int expect = 255;
        return result == expect;
    }

    public static void main(String[] args) {
        StringsTests stringsTests = new StringsTests();

        stringsTests.testStatus("Task1", stringsTests.testTask1());
        stringsTests.testStatus("Task2", stringsTests.testTask2());
        stringsTests.testStatus("Task3", stringsTests.testTask3());
        stringsTests.testStatus("Task4", stringsTests.testTask4());
        stringsTests.testStatus("Task5", stringsTests.testTask5());
    }
}
