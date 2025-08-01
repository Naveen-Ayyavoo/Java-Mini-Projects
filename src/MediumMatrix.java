public class MediumMatrix {

    int[][] matrix;

    MediumMatrix(int rows, int cols){
        matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter the Elements at index %d %d: ",i,j);
                matrix[i][j] = Medium.scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("Matrix");

        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    void sum(){
        int sum = 0;
        for (int[] rows : matrix) {
            for (int col : rows) {
                sum += col;
            }
        }
        System.out.println("Sum: " + sum);
    }

    void transpose(){

        if (matrix.length != matrix[0].length){
            System.out.println("The rows and columns should be Equal");
        }
        else {
            System.out.println("Transposed Matrix");

            int[][] matrixT = new int[matrix[0].length][matrix.length];

            for (int i = 0; i < matrixT.length; i++) {
                for (int j = 0; j < matrixT[0].length; j++) {
                    matrixT[j][i] = matrix[i][j];
                }
            }

            for (int[] row : matrixT) {
                for (int col : row) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }
        }
    }

    void symmetric(){
        // Transposing the Matrix
        int[][] matrixT = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrixT[0].length; i++) {
            for (int j = 0; j < matrixT.length; j++) {
                matrixT[j][i] = matrix[i][j];
            }
        }

        boolean isSymmetric = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrixT[i][j]){
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) break;
        }

        if (isSymmetric) System.out.println("It is a Symmetric Matrix");
        else System.out.println("It is not a Symmetric Matrix");
    }
}
