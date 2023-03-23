package Exp01;

public class T_12201425_1_2 {
    public static void main(String[] args) {
        int n = 5;
        printNumberTower(n);
    }

    public static void printNumberTower(int n) {
        if (n <= 0) {
            return;
        }
        printNumberTower(n - 1);
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d\t", i);
        }
        System.out.println();
    }
}
