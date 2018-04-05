package harman.tasks.strings;

import java.util.Arrays;

public class Task2 {
    public boolean isContainsSequenceOfChar(String line, char[] arrayOfChars) {
        return Arrays.equals(line.toCharArray(), arrayOfChars);
    }
}
