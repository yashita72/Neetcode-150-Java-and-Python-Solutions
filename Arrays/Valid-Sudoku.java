class Solution {//Boolean array tracking
    public boolean isValidSudoku(char[][] board) {
        boolean [][] rows=new boolean[9][9];
        boolean [][] cols=new boolean[9][9];
        boolean [][] boxes=new boolean[9][9];
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.'){
                    continue;//skip empty cells
                }
        int val=board[r][c]-'1';//convert char to int (0-8)
        int boxid=(r/3)*3+(c/3);//calculate box id based on row and column
        if (rows[r][val] || cols[c][val] || boxes[boxid][val]) {//if the value is already present in the row, column, or box, return false
            return false;
        }
        rows[r][val] = true;
        cols[c][val] = true;
        boxes[boxid][val] = true;
         }
      }
        return true;
 }}
 //time complexity is O(n^2) and space complexity is O(n^2) as we are using 3 boolean arrays of size 9x9 to track the presence of numbers in rows, columns, and boxes.
 //but here we r using constant space as the size of the boolean arrays is fixed and 
 // does not depend on the input size.
 //this solution is more efficient than using hashsets as it uses less space
 //  and is faster due to the use of boolean arrays.
 //this both time and space complexity is constant as the size of the board is fixed at 9x9, 
 // so the time and space complexity is O(1).