import java.util.Scanner;

public class matrixadd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrix
        System.out.print("Enter the number of rows in the matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrices: ");
        int columns = scanner.nextInt();

        // Initialize two matrices and one result matrix
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] sumMatrix = new int[rows][columns];

        // Input for the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input for the second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Adding the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the sum of the two matrices
        System.out.println("The sum of the two matrices is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
