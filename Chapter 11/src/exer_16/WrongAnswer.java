package exer_16;

import java.util.ArrayList;
import java.util.Scanner;

public class WrongAnswer {
    public static void main(String[] args) {
        mainMethod();
    }

    private static void mainMethod() {
        Scanner scanner = new Scanner(System.in);
        int number1 = (int) (Math.random() * 11);
        int number2 = (int) (Math.random() * 11);
        int result = number1 + number2;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (true){
            System.out.print("What is: " + number1 + " + " + number2 + "? ");
            int resultGot = scanner.nextInt();
            if (resultGot == result){
                System.out.print("You Got it!");
                break;
            } else if (arrayList.indexOf(resultGot) < 0){
                System.out.println("Wrong Answer\nTry Again.");
                arrayList.add(resultGot);
            } else {
                System.out.println("You already entered " + resultGot + "\nTry again.");
            }
        }
    }
}
