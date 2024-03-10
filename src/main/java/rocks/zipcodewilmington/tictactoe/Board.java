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
        for (int i = 0; i < matrix.length; i++ ) {
            if (matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2] && (matrix[i][0] == 'X')) {
                return true;
            }
        }
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[0][j] == matrix[1][j] && matrix[1][j] == matrix[2][j] && (matrix[0][j] == 'X')) {
                return true;
            }
        }
            return null;
}

        public Boolean isInFavorOfO () {
            return null;
        }

        public Boolean isTie () {
            return null;
        }

        public String getWinner () {
            return null;
        }

}

