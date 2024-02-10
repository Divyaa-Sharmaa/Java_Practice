public class nKnight {

    public static boolean isSafe(char board[][], int row, int col) {
        //left
        for(int i=row-2,j=col-1;i>=0 && j>=0;i++, j--){
            if(board[i][j] == 'K'){
                return false;
            }
        }

        //right
        for(int i=row-2,j=col+1;i<row && j>col+1; i++,j++){
            if(board[i][j]=='K'){
                return false;
            }
        }

        return true;
    }
    public static void nKnights(char board[][], int row) {
        // base condition
        if (row == board.length) {
            // printArr(board);
            count++;
            return;
        }
        // kaam
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'K';
                nKnights(board, row + 1);
                board[row][j] = 'x';
            }
        }

    }
    public static void printArr(char board[][]) {
        int count=0;
        System.out.println("--------- Chess board --------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
                count++;
            }
            System.out.println();
        }
        System.out.print("count: "+count);
    }

    public static int count = 0;
    public static void main(String[] args) {
      
        int n = 4; // The chessboard is N*N.
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nKnights(board, 0);
        System.out.println("\nTotal number of possible arrangements are :" + count);
    }
}
