package harman.tasks.strings;

import java.util.Arrays;

public class Task4 {
    public boolean isAnagram(String first, String second) {
        char[] firstArr = first.replace(" ", "").toLowerCase().toCharArray();
        char[] secondArr = second.replace(" ", "").toLowerCase().toCharArray();
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);
        return Arrays.equals(firstArr, secondArr);
    }
}
