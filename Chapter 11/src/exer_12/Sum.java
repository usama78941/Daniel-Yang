package exer_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("The sum of all the number entered: " + sum(getList()));
    }

    private static ArrayList<Integer> getList() {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1)   + ": ");
            integers.add(scanner.nextInt());
        }
        return integers;
    }

    private static double sum(ArrayList<Integer> integers) {
        double sum = 0;
        for (Integer integer : integers) {
            sum += integer;
        }
        return sum;
    }
}
