class Solution {
    public void islandsAndTreasure(int[][] grid) {
        if(grid==null || grid.length==0) return;

        int row = grid.length;
        int col = grid[0].length;   
        Queue<int[]> qu = new LinkedList<>();
        for(int r = 0;r<row;r++){
            for(int c =0;c<col;c++){
                if(grid[r][c]==0){
                    qu.add(new int[]{r,c});
                }
            }
        }

        int[][] direction = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!qu.isEmpty()){
            int[] curr = qu.poll();
            int r = curr[0];
            int c = curr[1];

            for(int[] dir:direction){
                int nextrow = r+dir[0];
                int nextcol = c+dir[1];
                if(nextrow>=0 && nextrow<row && nextcol>=0 && nextcol<col && grid[nextrow][nextcol] == Integer.MAX_VALUE ){
                    grid[nextrow][nextcol] = grid[r][c]+1;

                    qu.add(new int[]{nextrow, nextcol});
                }
            }
        }
    }
}
