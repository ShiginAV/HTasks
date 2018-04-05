package harman.tasks.strings;

import java.util.HashMap;

public class Task4 {
    public boolean isAnagram(String first, String second) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] firstStr = first.replace(" ", "").toLowerCase().toCharArray();
        char[] secondStr = second.replace(" ", "").toLowerCase().toCharArray();

        for (char ch : firstStr) {
            map.merge(ch, 1, (a, b) -> a + b);
        }

        for (char ch : secondStr) {
            if (map.get(ch) == null) {
                return false;
            }
            if (map.get(ch) - 1 == 0) {
                map.remove(ch);
            } else {
                map.put(ch, map.get(ch) - 1);
            }
        }
        return map.isEmpty();
    }
}
