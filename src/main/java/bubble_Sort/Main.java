package bubble_Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] inputInteger = new Integer[]{64, 34, 25, 12, 22, 11, 90};
        BubbleSort<Integer> bsInteger = new BubbleSort<>(inputInteger);
        Integer[] outputInteger = bsInteger.bubbleSort();

        System.out.println(Arrays.toString(outputInteger));

        String[] inputString = new String[]{"Marek", "Dawid", "Artur", "Daniel", "Mateusz", "Jakub", "Karol"};
        BubbleSort<String> bsString = new BubbleSort<>(inputString);
        String[] outputString = bsString.bubbleSort();

        System.out.println(Arrays.toString(outputString));


    }
}