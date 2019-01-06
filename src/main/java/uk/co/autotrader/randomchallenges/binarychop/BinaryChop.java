package uk.co.autotrader.randomchallenges.binarychop;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryChop {
    public int chop(int searchingFor, int[] data) {
        List<Integer> numbers = Arrays.stream(data).boxed().collect(Collectors.toList());

        if(data[getMiddleIndex(data)] == searchingFor) {
            return data.length / 2;
        }

        throw new IllegalArgumentException("Not yet implemented");
    }

    private int getMiddleIndex(int[] array) {
        if(array.length == 1){
            return 0;
        }
        else {
            return (array.length / 2) - 1;
        }

    }
}