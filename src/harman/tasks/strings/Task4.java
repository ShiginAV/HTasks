package harman.tasks.strings;

public class Task4 {
    public boolean isAnagram(String first, String second) {
        String firstStr = first.replace(" ", "").toLowerCase();
        String secondStr = second.replace(" ", "").toLowerCase();

        for (int i = 1; i < firstStr.length(); i++) {
            if (!firstStr.contains(secondStr.substring(i, i + 1))) {
                return false;
            }
        }
        return true;
    }
}
