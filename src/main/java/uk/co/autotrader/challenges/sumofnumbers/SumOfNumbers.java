package uk.co.autotrader.challenges.sumofnumbers;

public class SumOfNumbers {

    public String SumOfNumbersZeroToN(int value) {
        if (value < 0) {
            return value + "<0";
        }
        else if (value == 0) {
            return value + "=0";
        }
        else {
            int total = 0;
            int[] resultArray = populateResultsArray(value);
            String resultString = "";

            for (int i = 0; i < resultArray.length; i++) {
                total += resultArray[i];

                if (i < resultArray.length - 1) {
                    resultString += i + "+";
                }
                else {
                    resultString += i;
                }
            }
            return resultString + " = " + total;
        }
    }

    private int[] populateResultsArray(int value) {
        int [] resultArray = new int[value + 1];

        for (int i = 0; i <= value; i++) {
            resultArray[i] = i;
        }
        return resultArray;
    }
}
