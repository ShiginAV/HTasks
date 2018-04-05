package harman.tasks.tests.strings;

import harman.tasks.strings.Task1;
import harman.tasks.strings.Task2;
import harman.tasks.strings.Task3;
import harman.tasks.strings.Task4;
import harman.tasks.strings.Task5;

public class StringsTests {
    private final String DONE = "Test done";
    private final String FAILED = "Test failed";

    public String testTask1() {
        Task1 task1 = new Task1();
        char result = task1.getCharacterByIndex("Hello World", 6);
        return result == 'W' ? DONE : FAILED;
    }

    public String testTask2() {
        Task2 task2 = new Task2();
        return task2.isContainsSequenceOfChar("Hello", new char[] {'H', 'e', 'l', 'l', 'o'}) ? DONE : FAILED;
    }

    public String testTask3() {
        Task3 task3 = new Task3();
        String result = task3.getInitials("Ivan", "Petrov");
        return result.equals("I.P.") ? DONE : FAILED;
    }

    public String testTask4() {
        Task4 task4 = new Task4();
        return task4.isAnagram("Internet", "Tine Rent") ? DONE : FAILED;
    }

    public String testTask5() {
        Task5 task5 = new Task5();
        return task5.convertHexStringToDecInt("0xff") == 255 ? DONE : FAILED;
    }

    public static void main(String[] args) {
        StringsTests stringsTests = new StringsTests();

        System.out.println("Task1: " + stringsTests.testTask1());
        System.out.println("Task2: " + stringsTests.testTask2());
        System.out.println("Task3: " + stringsTests.testTask3());
        System.out.println("Task4: " + stringsTests.testTask4());
        System.out.println("Task5: " + stringsTests.testTask5());
    }
}
