package divisible;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static List<Integer> divisibleByThree(int from, int to) {
        return IntStream.range(from, to)
                .filter(num -> num % 3 == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        divisibleByThree(-50, 50).forEach(System.out::println);
    }
}
