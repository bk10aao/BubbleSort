import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortAlgorithmTest {

    private BubbleSortAlgorithm bubbleSortAlgorithm;

    @Before
    public void setUp() {
        this.bubbleSortAlgorithm = new BubbleSortAlgorithm(100, 100);
    }

    @Test
    public void given_anArrayOf100Elements_calling_algorithm_returnsSorted() {
        String start = bubbleSortAlgorithm.toString();

        assertFalse(checkSorted());

        bubbleSortAlgorithm.sort();

        assertTrue(checkSorted());

        String end = bubbleSortAlgorithm.toString();

        assertNotEquals(end, start);
    }

    private boolean checkSorted() {
        for(int i = 0; i < bubbleSortAlgorithm.numbers.length - 1; i++) {
            if(bubbleSortAlgorithm.numbers[i] > bubbleSortAlgorithm.numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }
}