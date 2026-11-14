class Solution:
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
        rows=len(matrix)
        cols=len(matrix[0])
        left=0
        right=rows*cols-1
        while left<=right:
            mid=(left+right)//2
            row=mid//cols #calculate the row index of the middle element
            col=mid%cols#calculate the column index of the middle element
            if matrix[row][col]==target:
                return True
            elif matrix[row][col]<target:
                left=mid+1
            else:
                right=mid-1
        return False
        
#time complexity: O(log(m*n)) where m is the number of rows and n is the number of columns
#space complexity: O(1) because we are using a constant amount of extra space
        
        