package Graphs;

public class Maxareaofisland {
    

    int rows, cols;
    int[][] grid;

    public int maxAreaOfIsland(int[][] grid) {

        this.grid = grid;

        rows = grid.length;
        cols = grid[0].length;

        int ans = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (grid[r][c] == 1) {

                    int m = dfs(r, c);

                    ans = Math.max(ans, m);
                }
            }
        }

        return ans;
    }

    private int dfs(int r, int c) {

        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == 0) {
            return 0;
        }

        grid[r][c] = 0;

        int total = 1;

        total += dfs(r - 1, c);
        total += dfs(r + 1, c);
        total += dfs(r, c - 1);
        total += dfs(r, c + 1);

        return total;
    }
}


//time complexity is big oh of n where n is the number of cells in the grid
//space complexity is big oh of n where n is the number of cells in the grid since in worst case
//  we can have all 1's and we will have to go through all the cells in the grid