class Solution {
    public int maxAreaOfIsland(int[][] grid) {
       if(grid==null || grid.length==0) return 0;

       int maxarea =0;
       int row = grid.length;
       int col = grid[0].length;
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(grid[i][j]==1){
                int currarea = calculate(grid,i,j);
                maxarea = Math.max(maxarea, currarea);
            }
        }
       } 
       return maxarea;
    }

    int calculate(int[][] grid, int r, int c){
        int row = grid.length;
        int col = grid[0].length;
        if(r<0 || r>=row || c<0 || c>=col || grid[r][c]==0){
            return 0;
        }
        grid[r][c] =0;
        int area = calculate(grid, r+1, c)
                    + calculate(grid, r-1,c)
                    + calculate(grid,r,c-1)
                    + calculate(grid, r, c+1);
        return 1+area;
    }
}
