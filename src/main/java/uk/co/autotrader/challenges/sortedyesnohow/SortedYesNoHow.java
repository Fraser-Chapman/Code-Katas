package uk.co.autotrader.challenges.sortedyesnohow;


public class SortedYesNoHow {

    public static String isSortedAndHow(int[] input) {
        boolean isAscending = isAscending(input);
        boolean isSorted = isSorted(input);

        if (isSorted) {
            if (isAscending) {
                return "yes, ascending";
            } else {
                return "yes, descending";
            }
        } else {
            return "no";
        }
    }

    private static boolean isAscending(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (i != (input.length - 1) && input[i] > input[i + 1]) {
                return false;
            }

        }
        return true;
    }

    private static boolean isSorted(int[] input) {
        boolean isAscending = false;
        boolean isSorted = false;
        if (input[0] < input[1]) {
            isAscending = true;
        }

        if (isAscending) {
            for (int i = 0; i < input.length; i++) {
                if (i == input.length - 1) {
                    break;
                } else if (input[i] < input[i + 1]) {
                    isSorted = true;
                } else {
                    isSorted = false;
                    break;
                }
            }

        }

        if (!isAscending) {
            for (int i = 0; i < input.length; i++) {
                if (i == input.length - 1) {
                    break;
                } else if (input[i] > input[i + 1]) {
                    isSorted = true;
                } else {
                    isSorted = false;
                    break;
                }
            }

        }
        return isSorted;
    }
}