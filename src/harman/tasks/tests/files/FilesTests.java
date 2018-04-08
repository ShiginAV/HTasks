package harman.tasks.tests.files;

import harman.tasks.files.Task2;
import harman.tasks.files.Task1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FilesTests {
    public void testStatus(String taskName, boolean test) {
        String status = test ? "Test done" : "Test failed";
        System.out.printf("%s: %s\n", taskName, status);
    }

    public boolean testTask1() {
        List<String> resultList = new LinkedList<>();
        Task1 task1 = new Task1(resultList);
        String file = "D:\\Programming\\Harman\\Tasks\\src\\harman\\tasks\\files\\text.txt";
        task1.printReversList(file);
        List<String> exceptList = new LinkedList<>(Arrays.asList("line - 3", "line - 2", "line - 1"));
        return exceptList.equals(resultList);
    }

    public boolean testTask2() {
        List<String> resultList = new LinkedList<>();
        Task2 task2 = new Task2(resultList);
        task2.printListOfFiles("D:\\textFiles");
        List<String> exceptList = new LinkedList<>(Arrays.asList("text1.txt", "text2.txt", "text3.txt"));
        return exceptList.equals(resultList);
    }

    public static void main(String[] args) {
        FilesTests filesTests = new FilesTests();

        filesTests.testStatus("Task1", filesTests.testTask1());
        filesTests.testStatus("Task2", filesTests.testTask2());
    }
}
