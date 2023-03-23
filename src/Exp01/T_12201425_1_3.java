package Exp01;

public class T_12201425_1_3 {
    private int[] numbers;

    public T_12201425_1_3(int n) {
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }
    }

    public void sieve() {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] % numbers[i] == 0) {
                    numbers[j] = 0;
                }
            }
        }
    }

    public void printPrimes() {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                System.out.printf("%d\t", numbers[i]);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        T_12201425_1_3 main = new T_12201425_1_3(100);
        main.sieve();
        main.printPrimes();
    }
}
