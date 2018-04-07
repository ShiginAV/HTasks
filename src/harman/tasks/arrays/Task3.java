package harman.tasks.arrays;

public class Task3 {
    public void printMultTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
    }
}
