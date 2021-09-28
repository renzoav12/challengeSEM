package com.challenge.sem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.IntStream;

public class ChallengeSemTest {

    @Test
    public void whenElementsIsEmptyThenReturnEmptyList(){
        ChallengeSem challengeSem = new ChallengeSem();
        int[] elements = new int[0];
        List<Pair> result = challengeSem.getResult(elements);

        Assertions.assertEquals(result.size(), 0);
    }

    @Test
    public void whenElementsIsNullThenReturnEmptyList(){
        ChallengeSem challengeSem = new ChallengeSem();
        List<Pair> result = challengeSem.getResult(null);

        Assertions.assertEquals(result.size(), 0);
    }

    @Test
    public void printFirstCaseOfUseExample() {
        int[] array = IntStream.of(4, 5, 2, 25).toArray();
        ChallengeSem ch = new ChallengeSem();
        List<Pair> result = ch.getResult(array);

        Assertions.assertEquals(array.length, result.size());
        ch.printResult(ch.getResult(array));
    }

    @Test
    public void printSecondCaseOfUseExample() {
        int[] array = IntStream.of(13, 7, 6, 12).toArray();
        ChallengeSem ch = new ChallengeSem();
        List<Pair> result = ch.getResult(array);

        Assertions.assertEquals(array.length, result.size());
        ch.printResult(ch.getResult(array));
    }
}
