public class Chess {
    void main() {
        int[][] board = new int[8][8];

        board[0][0] = 5;

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                System.out.print(board[x][y]);
            }
            System.out.println();
        }
    }
}
