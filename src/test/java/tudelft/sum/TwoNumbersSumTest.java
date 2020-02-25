package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    private TwoNumbersSum twoNumbersSum;

    @BeforeEach
    public void initialize() {
        this.twoNumbersSum = new TwoNumbersSum();
    }

    @Test
    public void sameLengthArrays() {
        ArrayList<Integer> one = new ArrayList<>(Arrays.asList(2, 4, 3));
        ArrayList<Integer> two = new ArrayList<>(Arrays.asList(5, 6, 4));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(7, 0, 8));
        Assertions.assertEquals(expected, twoNumbersSum.addTwoNumbers(one, two));
    }

    @Test
    public void differentLengthArrays() {
        ArrayList<Integer> one = new ArrayList<>(Arrays.asList(4, 3));
        ArrayList<Integer> two = new ArrayList<>(Arrays.asList(5, 6, 4));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(7, 0, 6));
        Assertions.assertEquals(expected, twoNumbersSum.addTwoNumbers(one, two));
    }

}
