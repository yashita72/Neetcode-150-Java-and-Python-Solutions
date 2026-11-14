package BinarySearch;

public class Searchinatwodmatrix {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0;
        int rows=matrix.length;
        int cols=matrix[0].length;
        int right=rows*cols-1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            int row=mid/cols;
            int col=mid%cols;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                left=1+mid;
            }
            else{
                right=mid-1;
            }
        }
        return false;

        
    }
}//time complexity: O(log(m*n)) where m is the number of rows and n is the number of columns
//space complexity: O(1) because we are using a constant amount of extra space