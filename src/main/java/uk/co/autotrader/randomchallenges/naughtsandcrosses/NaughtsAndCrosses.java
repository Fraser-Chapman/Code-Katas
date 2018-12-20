package uk.co.autotrader.randomchallenges.naughtsandcrosses;

public class NaughtsAndCrosses {
    public String[][] grid;

    public void generateGrid() {
        grid = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
    }

    public String displayGrid() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (j == 1) {
                    stringBuilder.append("|" + grid[i][j] + "|");
                } else {
                    stringBuilder.append(grid[i][j]);
                }
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
