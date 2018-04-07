package harman.tasks.sorts;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task3 {
    public Integer findMaxElemByStream(Integer[] array) {
        Stream<Integer> streamArray = Arrays.stream(array);
        return streamArray.max(Integer::compareTo).get();
    }
}
