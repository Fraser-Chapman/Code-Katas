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

    public void placeCounter(String counterType, String position) {
        switch (position) {
            case "top-left":
                grid[0][0] = counterType.toUpperCase();
                break;

            case "top-middle":
                grid[0][1] = counterType.toUpperCase();
                break;

            case "top-right":
                grid[0][2] = counterType.toUpperCase();
                break;

            case "middle-left":
                grid[1][0] = counterType.toUpperCase();
                break;

            case "middle-middle":
                grid[1][1] = counterType.toUpperCase();
                break;

            case "middle-right":
                grid[1][2] = counterType.toUpperCase();
                break;

            case "bottom-left":
                grid[2][0] = counterType.toUpperCase();
                break;

            case "bottom-middle":
                grid[2][1] = counterType.toUpperCase();
                break;

            case "bottom-right":
                grid[2][2] = counterType.toUpperCase();
                break;

            default:
                System.out.println("invalid input");
                break;
        }
    }
}
