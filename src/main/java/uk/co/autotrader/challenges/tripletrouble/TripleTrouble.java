package uk.co.autotrader.challenges.tripletrouble;

import java.util.ArrayList;
import java.util.List;

public class TripleTrouble {

    public static int TripleDouble(long num1, long num2){

        TripleDoubleProcessor returnStorer = new TripleDoubleProcessor(num1, num2);

        returnStorer.isTripleInNumOne();
        returnStorer.isDoubleInNumTwo();

        if ((returnStorer.isTripleInNumOne() == true) && (returnStorer.isDoubleInNumTwo() == true)){
            return 1;
        }
        else {
            return 0;
        }
    }
}

class TripleDoubleProcessor {

    private final List<Long> num1Array = new ArrayList<>();
    private final List<Long> num2Array = new ArrayList<>();
    long num1;
    long num2;
    long numberFoundByIsTriple;


    public TripleDoubleProcessor(long num1, long num2) {

        this.num1 = num1;
        this.num2 = num2;

        for (int i; num1 != 0; num1 /= 10){
            num1Array.add(num1 % 10);
        }

        for(int i; num2 != 0; num2 /= 10){
            num2Array.add(num2 % 10);
        }

    }

    public boolean isTripleInNumOne() {

        for(int i = 0; i < (num1Array.size() - 2); i++) {

            if (num1Array.get(i) == num1Array.get(i + 1) && num1Array.get(i) == num1Array.get(i + 2)) {
                numberFoundByIsTriple = num1Array.get(i);
                return true;
            }
        }
        return false;
    }

    public boolean isDoubleInNumTwo() {

        for (int i = 0; i < (num2Array.size() - 1); i++) {
            if ((num2Array.get(i) == num2Array.get(i + 1)) && (num2Array.get(i) == numberFoundByIsTriple)) {
                return true;
            }
        }
        return false;
    }
}
