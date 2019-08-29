package exer_11;

import java.util.Scanner;

public class LinearEquation {
    private int a, b, c, d, e, f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }

    public boolean isSolvable() {
        return ((a * d) - (b * c)) != 0;
    }

    public String getX() {
        if (isSolvable()) {
            return (((e * d) - (b * f)) / ((a * d) - (b * c))) + "";
        } else {
            return "the equation is not solvable..!!";
        }
    }

    public String getY() {
        if (isSolvable()) {
            return (((a * f) - (e * c)) / ((a * d) - (b * c))) + "";

        } else {
            return "the equation is not solvable..!!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of a, b, c, d, e and f separated by a space: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
        System.out.println(linearEquation.getY());
        System.out.println(linearEquation.getX());

    }
}