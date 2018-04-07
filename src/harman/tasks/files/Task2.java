package harman.tasks.files;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    private List<String> listOfFiles;

    public Task2(List<String> listOfFiles) {
        this.listOfFiles = listOfFiles;
    }

    private void findAllTxtFiles(String path) {
        File folder = new File(path);
        String[] fileNames = folder.list((dir, name) -> name.endsWith(".txt"));
        if (fileNames != null) {
            listOfFiles.addAll(Arrays.asList(fileNames));
        }
    }

    public void printListOfFiles(String path) {
        findAllTxtFiles(path);
        for (String fileName : listOfFiles) {
            System.out.println(fileName);
        }
    }
}
