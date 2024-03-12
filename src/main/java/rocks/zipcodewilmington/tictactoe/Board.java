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
        int rDiag = 0;
        int lDiag = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][0] == 'X' && matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2]) {
                    return true;

                } else if (matrix[0][j] == 'X' && matrix[0][j] == matrix[1][j] && matrix[1][j] == matrix[2][j]) {
                    return true;

                } else if (matrix[i][j] == 'X') {
                    rDiag++;

                } else if (matrix[i][matrix.length-1-i] == 'X') {
                    lDiag++;
                }

                if (rDiag == 3 || lDiag == 3) {
                    return true;
                }
            }
        }
            return false;
    }

    public Boolean isInFavorOfO() {
        int rDiag = 0;
        int lDiag = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][0] == 'O' && matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2]) {
                    return true;

                } else if (matrix[0][j] == 'O' && matrix[0][j] == matrix[1][j] && matrix[1][j] == matrix[2][j]) {
                    return true;

                } else if (matrix[i][j] == 'O') {
                    rDiag++;

                } else if (matrix[i][matrix.length-1-i] == 'O') {
                    lDiag++;
                }

                if (rDiag == 3 || lDiag == 3) {
                    return true;
                }
            }
        }
            return false;
    }

    public Boolean isTie() {
        return false;
    }

    public String getWinner() {
        if (isInFavorOfX() && !isInFavorOfO()) {
            return "X";
        } else if (!isInFavorOfX() && isInFavorOfO()) {
            return "O";
        }
        return null;
    }

    }
