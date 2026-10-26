class Solution:
    def maxAreaOfIsland(self, grid: list[list[int]]) -> int:
        rows=len(grid)
        cols=len(grid[0])
        def dfs(r,c):
            if r <0 or c<0 or r>=rows or c>=cols or grid[r][c]==0:
                return 0
            total=grid[r][c]
            grid[r][c]=0
            total+=dfs(r+1,c)
            total+=dfs(r-1,c)
            total+=dfs(r,c-1)
            total+=dfs(r,c+1)
            return total
        ans=0
        for r in range(rows):
            for c in range(cols):
                if grid[r][c]!=0:
                  m= dfs(r,c)
                  if m>ans:
                    ans=m
        return ans
    #both space and time complexity is O(n*m) where n is number of rows and m is number of columns


    
            
        

            
        