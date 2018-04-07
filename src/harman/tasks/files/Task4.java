package harman.tasks.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task4 {
    public void splitFile(String sourceFile, String thirtyPercentFile, String seventyPercentFile) throws IOException {
        File source = new File(sourceFile);
        long thirtyPercentLength = source.length() / 3;

        FileInputStream in = new FileInputStream(source);
        FileOutputStream outThirty = new FileOutputStream(thirtyPercentFile);
        FileOutputStream outSeventy = new FileOutputStream(seventyPercentFile);

        long read = 0;
        int b;
        while ((b = in.read()) >= 0) {
            read++;
            if (read <= thirtyPercentLength) {
                outThirty.write(b);
            } else {
                outSeventy.write(b);
            }
        }
        outThirty.close();
        outSeventy.close();
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        String source = "D:\\textFiles\\splitFiles\\source.txt";
        String thirtyPer = "D:\\textFiles\\splitFiles\\thirtyPer.txt";
        String seventyPer = "D:\\textFiles\\splitFiles\\seventyPer.txt";
        try {
            task4.splitFile(source, thirtyPer, seventyPer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
