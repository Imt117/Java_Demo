package Exp01;

import java.util.Scanner;

public class T_12201425_1_4 {
    private double a, b, c, d;

    public void inputCoefficients() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter coefficient a: ");
            a = scanner.nextDouble();
            System.out.print("Enter coefficient b: ");
            b = scanner.nextDouble();
            System.out.print("Enter coefficient c: ");
            c = scanner.nextDouble();
            System.out.print("Enter coefficient d: ");
            d = scanner.nextDouble();
        } while (!isMonotonic());
    }

    public double bisectionMethod(double x1, double x2) {
        double f1 = f(x1);
        double f2 = f(x2);
        double xm = (x1 + x2) / 2;
        double fm = f(xm);
        while (Math.abs(fm) >= 1e-5) {
            if (f1 * fm < 0) {
                x2 = xm;
                f2 = fm;
            } else {
                x1 = xm;
                f1 = fm;
            }
            xm = (x1 + x2) / 2;
            fm = f(xm);
        }
        return xm;
    }

    public double newtonMethod(double x0) {
        double x1 = x0;
        double x2 = x0;
        do {
            x1 = x2;
            x2 = x1 - f(x1) / fDerivative(x1);
        } while (Math.abs(x2 - x1) >= 1e-5);
        return x2;
    }

    private double f(double x) {
        return a * x * x * x + b * x * x + c * x + d;
    }

    private double fDerivative(double x) {
        return 3 * a * x * x + 2 * b * x + c;
    }

    private boolean isMonotonic() {
        double delta = b * b - 3 * a * c;
        if (a == 0) {
            if (b == 0) {
                return false;
            } else {
                return true;
            }
        } else if (delta < 0) {
            return true;
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (3 * a);
            double x2 = (-b - Math.sqrt(delta)) / (3 * a);
            return x1 <= x2;
        }
    }

    public static void main(String[] args) {
        T_12201425_1_4 equation = new T_12201425_1_4();
        equation.inputCoefficients();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the left endpoint of the interval: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the right endpoint of the interval: ");
        double x2 = scanner.nextDouble();
        double root1 = equation.bisectionMethod(x1, x2);
        double root2 = equation.newtonMethod(x1);
        double root3 = equation.newtonMethod(x2);
        System.out.println("Bisection method result: " + root1);
        System.out.println("Newton method result 1: " + root2);
        System.out.println("Newton method result 2: " + root3);
    }
}

