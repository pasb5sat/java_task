public class Matrix {
    private double[][] matrix;
    private int rows;
    private int columns;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = matrix[0].length;
    }

    public Matrix(int rows, int columns) {
        this.matrix = new double[rows][columns];
        this.rows = rows;
        this.columns = columns;
    }

    public Matrix add(Matrix otherMatrix) {
        if (this.rows != otherMatrix.rows || this.columns != otherMatrix.columns) {
            throw new IllegalArgumentException("Matrix dimensions do not match.");
        }

        Matrix resultMatrix = new Matrix(this.rows, this.columns);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                resultMatrix.matrix[i][j] = this.matrix[i][j] + otherMatrix.matrix[i][j];
            }
        }

        return resultMatrix;
    }

    public Matrix multiply(double scalar) {
        Matrix resultMatrix = new Matrix(this.rows, this.columns);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                resultMatrix.matrix[i][j] = this.matrix[i][j] * scalar;
            }
        }

        return resultMatrix;
    }

    public Matrix multiply(Matrix otherMatrix) {
        if (this.columns != otherMatrix.rows) {
            throw new IllegalArgumentException("Matrix dimensions are not valid for multiplication.");
        }

        Matrix resultMatrix = new Matrix(this.rows, otherMatrix.columns);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < otherMatrix.columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    resultMatrix.matrix[i][j] += this.matrix[i][k] * otherMatrix.matrix[k][j];
                }
            }
        }

        return resultMatrix;
    }

    public void print() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}