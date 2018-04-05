package harman.tasks.strings;

public class Task5 {
    public int convertHexStringToDecInt(String hex) {
        return Integer.parseInt(hex.replace("0x", ""), 16);
    }
}
