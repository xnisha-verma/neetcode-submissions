class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0) return 0;
        int islandcount = 0;
        int rows = grid.length;
        int col = grid[0].length;

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    islandcount++;
                    dfs(grid,i,j);
                }
            }
        }
        return islandcount;
    }
    private void dfs(char[][] grid, int r, int c){
        int row = grid.length;
        int col = grid[0].length;
        if(r<0||r>=row|| c<0|| c>=col|| grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        dfs(grid, r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
}
