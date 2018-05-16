package harman.tasks.strings;

public class Task2 {
    public boolean isContainsSequenceOfChar(String line, char[] arrayOfChars) {
        return line.contains(String.valueOf(arrayOfChars));
    }
}
