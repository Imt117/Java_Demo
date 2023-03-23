package Exp01;

public class T_12201425_1_1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && i != k && j != k) {
                        int num = i * 100 + j * 10 + k;
                        System.out.printf("%d\t", num);
                        count++;
                        if (count % 4 == 0) {
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
