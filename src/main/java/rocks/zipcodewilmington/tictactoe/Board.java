package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */

public class Board {
    private Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                if (matrix[i][0] == 'X' && matrix[i][0] == matrix[i][1] && matrix[i][0] == matrix[i][2]) {
                    return true;
                } else if (matrix[0][j] == 'X' && matrix[0][j] == matrix[1][j] && matrix[0][j] == matrix[2][j]) {
                    return true;
                } else if (matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X') {
                    return true;
                } else if (matrix[0][2] == 'X' && matrix[1][1] == 'X' && matrix[2][0] == 'X') {
                    return true;
                }
            }
        }
            return false;
    }

    public Boolean isInFavorOfO() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                if (matrix[i][0] == 'O' && matrix[i][0] == matrix[i][1] && matrix[i][0] == matrix[i][2]) {
                    return true;
                } else if (matrix[0][j] == 'O' && matrix[0][j] == matrix[1][j] && matrix[0][j] == matrix[2][j]) {
                    return true;
                } else if (matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O') {
                    return true;
                } else if (matrix[0][2] == 'O' && matrix[1][1] == 'O' && matrix[2][0] == 'O') {
                    return true;
                }
            }
        }
            return false;
    }

    public Boolean isTie() {
        if (isInFavorOfX() == isInFavorOfO()) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        if (isInFavorOfX() && !isInFavorOfO()) {
            return "X";
        } else if (!isInFavorOfX() && isInFavorOfO()) {
            return "O";
        }
            return "";
    }

}
