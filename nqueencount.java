public class nqueencount {
    public static void queen(char board[][],int row){
        if(row==board.length){
            count++;
            return;
        }
        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
                board[row][j]='Q';
                queen(board, row+1);
                board[row][j]='x';

            }
        }
    }

    public static boolean issafe(char[][] board, int row, int col) {
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }

        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
                if(board[i][j]=='Q'){
                    return false;
                }
        }
        return true;
    }

    public static void printboard(char[][] board) {
        System.out.println("----------------CHESS BOARD---------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void main(String[] args) {
        int n=5;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        queen(board, 0);
        System.out.println("total number of ways = "+ count);
    }
}
