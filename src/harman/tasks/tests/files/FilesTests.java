package harman.tasks.tests.files;

import harman.tasks.files.Task2;
import harman.tasks.files.Task1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FilesTests {
    private final String DONE = "Test done";
    private final String FAILED = "Test failed";

    public String testTask1() {
        List<String> resultList = new LinkedList<>();
        Task1 task1 = new Task1(resultList);
        String file = "D:\\Programming\\Harman\\Tasks\\src\\harman\\tasks\\files\\text.txt";
        task1.printReversList(file);
        List<String> exceptList = new LinkedList<>(Arrays.asList("line - 3", "line - 2", "line - 1"));
        return exceptList.equals(resultList) ? DONE : FAILED;
    }

    public String testTask2() {
        List<String> resultList = new LinkedList<>();
        Task2 task2 = new Task2(resultList);
        task2.printListOfFiles("D:\\textFiles");
        List<String> exceptList = new LinkedList<>(Arrays.asList("text1.txt", "text2.txt", "text3.txt"));
        return exceptList.equals(resultList) ? DONE : FAILED;
    }







    public static void main(String[] args) {
        FilesTests filesTests = new FilesTests();

        System.out.println("Task1: " + filesTests.testTask1());
        System.out.println("Task2: " + filesTests.testTask2());
//        System.out.println("Task3: " + filesTests.testTask3());
//        System.out.println("Task4: " + filesTests.testTask4());
//        System.out.println("Task5: " + filesTests.testTask5());
    }
}
