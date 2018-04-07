package harman.tasks.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Task5 {
    public void changeLowToUppAndDoubleSpace(String sourceFile, String targetFile) {
        PrintWriter outputStream = null;
        try (BufferedReader inputStream = new BufferedReader(new FileReader(sourceFile))) {
            outputStream = new PrintWriter(targetFile);
            String line;
            while((line = inputStream.readLine()) != null) {
                String result = line.toUpperCase().replace(" ", "  ");
                outputStream.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        String source = "D:\\Programming\\Harman\\Tasks\\src\\harman\\tasks\\tests\\textFiles\\sourceTextTask5.txt";
        String target = "D:\\Programming\\Harman\\Tasks\\src\\harman\\tasks\\tests\\textFiles\\targetTextTask5.txt";
        task5.changeLowToUppAndDoubleSpace(source, target);
    }
}
