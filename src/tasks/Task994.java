package tasks;

/** 994. Rotting Oranges */
public class Task994 {

    public static void main(String[] args) {
        // test1
        int[][] grid1 = {{2,1,1},{1,1,0},{0,1,1}};

        System.out.println(new Task994().orangesRotting(grid1));

        // test2
        int[][] grid2 = {{2,1,1},{0,1,1},{1,0,1}};

        System.out.println(new Task994().orangesRotting(grid2));

        // test3
        int[][] grid3 = {{0,2}};

        System.out.println(new Task994().orangesRotting(grid3));
    }

    public int orangesRotting(int[][] grid) {

        int time = 0, lastTime = 0;
        boolean rotten, fresh;

        while (true) {

            fresh = false;

            for (int r = 0; r < grid.length; r++) {
                for (int c = 0; c < grid[r].length; c++) {
                    rotten = false;
                    if (grid[r][c] == 1) {
                        fresh = true;
                        if (c < grid[r].length - 1 && grid[r][c + 1] > 1 && grid[r][c + 1] < lastTime + 3) {
                            rotten = true;
                        } else if (r < grid.length - 1 && grid[r + 1][c] > 1 && grid[r + 1][c] < lastTime + 3) {
                            rotten = true;
                        } else if (c > 0 && grid[r][c - 1] > 1 && grid[r][c - 1] < lastTime + 3) {
                            rotten = true;
                        } else if (r > 0 && grid[r - 1][c] > 1 && grid[r - 1][c] < lastTime + 3) {
                            rotten = true;
                        }
                        if (rotten) {
                            grid[r][c] = lastTime + 3;
                            if (time == lastTime) {
                                time++;
                            }
                        }
                    }
                }
            }

            if (lastTime == time) {
                return fresh ? -1 : time;
            }
            lastTime = time;
        }

    }

}
