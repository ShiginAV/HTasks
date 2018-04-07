package harman.tasks.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class Task3 {
    public void copyFile(String source, String dest) {
        try {
            //Files.copy(Paths.get(source), new FileOutputStream(dest));
            FileChannel src = new FileInputStream(source).getChannel();
            FileChannel des = new FileOutputStream(dest).getChannel();
            des.transferFrom(src, 0, src.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.copyFile("D:\\textFiles\\text1.txt", "D:\\textFiles\\text2.txt");
    }
}
