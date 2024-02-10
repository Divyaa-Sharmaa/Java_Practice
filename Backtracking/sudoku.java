public class sudoku {
    public static void main(String[] args) {
        int[][] sudoku = {{}}; // give ur own sudoku
        if(solveSudoku(sudoku,0,0)){
            System.out.println("Solution exists");
            printSudoku(sudoku);
        }else{
            System.out.println("No solution exists");
        }
    }
    
    public static void printSudoku(int[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j] + "");
            }
          System.out.println();
        }
    }
    public static boolean isSafe(int[][] board, int row, int col, int digit){
        //row
        for(int i = 0;i<=8;i++){
            if(board[row][i] == digit) 
              return false;
        }

        //column
        for(int j=0;j<=8;j++){
            if(board[j][col]==digit)
             return false;
        }

        //grid
         int sr = (row/3)*3;
         int sc = (col/3)*3;
         for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==digit)
                 return false;
            }
         }
         return false;
    }

    public static boolean solveSudoku(int[][] board, int row, int col){
        //kaam
        int nextRow = row, nextCol = col+1;
        if(nextCol==9){
            nextRow = row+1;
            nextCol = 0;
        }

        for(int i =1; i<=9;i++){
            if(isSafe(board,row,col,i)){
                board[row][col] = i;
                if(solveSudoku(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }
}
