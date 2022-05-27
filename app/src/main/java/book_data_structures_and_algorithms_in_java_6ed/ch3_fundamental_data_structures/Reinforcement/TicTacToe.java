package book_data_structures_and_algorithms_in_java_6ed.ch3_fundamental_data_structures.Reinforcement;

public class TicTacToe {
    public static final int X = 1, O = -1;
    public static final int EMPTY = 0;
    private int board[][] = new int[3][3];
    private int player;

    public TicTacToe() {
        clearBoard();
    }

    public void clearBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                board[i][j] = EMPTY;
            player = X;
        }
    }

    public void putMark(int i, int j) throws IllegalStateException, IllegalArgumentException {
        if (winner() != 0)
            throw new IllegalStateException("Board has already been won");
        if ((i < 0) || (i > 2) || (j < 0) || (j > 2))
            throw new IllegalArgumentException("Invalid board position");
        if (board[i][j] != EMPTY)
            throw new IllegalArgumentException("Board position occupied");
        board[i][j] = player;
        player = -player;
    }

    public boolean isWin(int mark) {
        return ((board[0][0] + board[0][1] + board[0][2] == mark * 3) // row 0
                || (board[1][0] + board[1][1] + board[1][2] == mark * 3) // row 1
                || (board[2][0] + board[2][1] + board[2][2] == mark * 3) // row 2
                || (board[0][0] + board[1][0] + board[2][0] == mark * 3) // column 0
                || (board[0][1] + board[1][1] + board[2][1] == mark * 3) // column 1
                || (board[0][2] + board[1][2] + board[2][2] == mark * 3) // column 2
                || (board[0][0] + board[1][1] + board[2][2] == mark * 3) // diagonal
                || (board[2][0] + board[1][1] + board[0][2] == mark * 3)); // rev diagonal
    }

    public int winner() {
        if (isWin(X))
            return X;
        if (isWin(O))
            return O;
        else
            return 0;
    }
}