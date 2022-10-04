import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class BubbleSortAlgorithm {
    //number of arrangements: 0 * n^2

    private static final int NUMBER_RANGE = 1_000_000;

    int[] numbers;

    public static void main(String[] args) {
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm(100_000, 1_000_000);
        System.out.printf("Before: %s", bubbleSortAlgorithm);
        bubbleSortAlgorithm.sort();
        System.out.printf("After:  %s\n", Arrays.toString(bubbleSortAlgorithm.numbers));
    }

    public void sort () {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if(numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    public BubbleSortAlgorithm(int arraySize, int numberRange) {
        Random random = new Random();
        numbers = new int[arraySize];
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = random.nextInt(numberRange);

    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}
