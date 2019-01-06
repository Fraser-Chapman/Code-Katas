package uk.co.autotrader.randomchallenges.binarychop;

public class BinaryChop {
    public int chop(int searchingFor, int[] data) {
        if(data[getMiddleIndex(data)] == searchingFor) {
            return data.length / 2;
        }
        else {
            return -1;
        }
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