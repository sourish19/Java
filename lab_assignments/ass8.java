import java.util.Scanner;

class Matrix {

    static void product(int[][] matx1, int[][] matx2, int mat1Row, int mat1Col, int mat2Row, int mat2Col) {
        int[][] result = new int[mat1Row][mat2Col];

        for (int i = 0; i < mat1Row; i++) {
            for (int j = 0; j < mat2Col; j++) {
                int sum = 0;
                for (int k = 0; k < mat1Col; k++) {
                    sum += matx1[i][k] * matx2[k][j];
                }
                result[i][j] = sum;
            }
        }
        Matrix.displayMatrix(result, mat1Row, mat2Col);
    }

    static void matrixInput(int[][] matx, int row, int column, String type) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for " + type + ": ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matx[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    static int rowColumnInput(String type, String matrix) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of " + type + " for " + matrix + ": ");
        int val = sc.nextInt();
        sc.close();
        return val;
    }

    static void displayMatrix(int[][] matx, int row, int column) {
        System.out.println("Result matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matx[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

public class ass8 {
    public static void main(String[] args) {
        // * either take hardcoded i/p
        int matrix1[][] = {
                { 3, 5, 9, 3 },
                { 7, 2, 8, 5 },
                { 1, 4, 6, 7 }
        };
        int matrix2[][] = {
                { 9, 7 },
                { 5, 1 },
                { 2, 6 },
                { 3, 4 }
        };

        // * otherwise take i/p through scanner
        int mat1Clm = Matrix.rowColumnInput("column", "matrix 1");
        int mat1Row = Matrix.rowColumnInput("row", "matrix1");

        int mat2Clm = Matrix.rowColumnInput("column", "matrix 2");
        int mat2Row = Matrix.rowColumnInput("row", "matrix 2");

        int[][] mat1 = new int[mat1Row][mat1Clm];
        int[][] mat2 = new int[mat2Row][mat2Clm];

        Matrix.matrixInput(mat1, mat1Row, mat1Clm, "matrix 1");
        Matrix.matrixInput(mat2, mat2Row, mat2Clm, "matrix 2");

        Matrix.product(mat1, mat2, mat1Row, mat1Clm, mat2Row, mat2Clm);
    }
}

/*
 * 3x4 × 4x2 = 3x2
 * [0][0] * [0][0] | [0][1] * [1][0] | [0][2] * [2][0] | [0][3] * [3][0]
 * [0][0] * [0][1] | [1][1] * [1][0] | [0][2] * [2][0] | [0][3] * [3][0]
 * 
 */