package uk.co.autotrader.challenges.brokensequence;

import java.util.Arrays;
import java.util.List;

public class BrokenSequence {
    public int findMissingNumber(String sequence) {
        int missing = 0;

        List<String> alphabet = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

        List<String> input = Arrays.asList(sequence.split(" "));

        Boolean containsCharacters = input.stream().anyMatch(character -> input.contains(alphabet));

        if (containsCharacters){
            missing = 1;
        }

//        input.stream().filter(character -> !"a".equals(character) || !"b".equals(character) || !"c".equals(character) || !"d".equals(character) || !"e".equals(character) || !"f".equals(character) || !"g".equals(character) || !"h".equals(character) || !"i".equals(character) || !"j".equals(character) || !"k".equals(character) || !"l".equals(character) || !"m".equals(character) || !"n".equals(character) || !"o".equals(character) || !"p".equals(character) || !"q".equals(character) || !"r".equals(character) || !"s".equals(character) || !"t".equals(character) || !"u".equals(character) || !"v".equals(character) || !"w".equals(character) || !"x".equals(character) || !"y".equals(character) || !"z".equals(character))
//                .sorted()

        return missing;
    }

}
