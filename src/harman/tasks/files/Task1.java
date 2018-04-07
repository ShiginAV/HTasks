package harman.tasks.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Task1 {
    private List<String> listOfStrings;

    public Task1(List<String> listOfStrings) {
        this.listOfStrings = listOfStrings;
    }

    private void fromFileToList(String file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                listOfStrings.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printReversList(String file) {
        fromFileToList(file);
        Collections.reverse(listOfStrings);
        for (String line : listOfStrings) {
            System.out.println(line);
        }
    }
}
