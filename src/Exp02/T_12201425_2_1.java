package Exp02;

import java.util.Scanner;

public class T_12201425_2_1 {

    private int[][] matrix;
    private int rows;
    private int cols;

    public T_12201425_2_1() {
        this.rows = 3;
        this.cols = 3;
        this.matrix = new int[rows][cols];
    }

    public T_12201425_2_1(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
    }

    public void inputMatrix() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public void displayMatrix() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public T_12201425_2_1 transpose() {
        T_12201425_2_1 transposedMatrix = new T_12201425_2_1(cols, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix.matrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    public void displayAverageOfRows() {
        System.out.println("Average of rows:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            double rowAvg = (double) rowSum / cols;
            System.out.printf("%.2f ", rowAvg);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        T_12201425_2_1 matrix = new T_12201425_2_1(rows, cols);

        matrix.inputMatrix();
        matrix.displayMatrix();

        T_12201425_2_1 transposedMatrix = matrix.transpose();
        transposedMatrix.displayMatrix();

        matrix.displayAverageOfRows();

        sc.close();
    }

}
