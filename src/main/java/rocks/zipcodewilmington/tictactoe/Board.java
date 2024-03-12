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
            for (int j = 0; j < matrix[i].length; j++) {
                if ((matrix[i][0] == 'X') && matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2]) {
                    return true;
                } else if ((matrix[0][j] == 'X') && matrix[0][j] == matrix[1][j] && matrix[1][j] == matrix[2][j]) {
                    return true;
                } else if (matrix[i][matrix.length-1-i] == 'X') {
                    return true;
                } else if (matrix[matrix.length-1-j][j] == 'X') {
                    return true;
                }
            }
        }
            return false;
    }

    public Boolean isInFavorOfO() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][0] == 'O' && matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2]) {
                    return true;
                } else if ((matrix[0][j] == 'O') && matrix[0][j] == matrix[1][j] && matrix[1][j] == matrix[2][j]) {
                    return true;
                } else if (matrix[i][matrix.length-1-i] == 'O') {
                    return true;
                } else if (matrix[matrix.length-1-j][j] == 'O') {
                    return true;
                }
            }
        }
            return false;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

    }
