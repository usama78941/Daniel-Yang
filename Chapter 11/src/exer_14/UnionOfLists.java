package exer_14;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionOfLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter values for list 1: ");
        int index = 0;
        while (index < 5) {
            list1.add(scanner.nextInt());
            index += 1;
        }

        System.out.print("Enter values for list 2: ");

        index = 0;
        while (index < 5) {
            list2.add(scanner.nextInt());
            index += 1;
        }

        ArrayList<Integer> integers = union(list1, list2);
        System.out.print("The combines list is: ");

        for (Integer integer: integers){
            System.out.print(integer + " ");
        }

    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            arrayList.add(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            arrayList.add(list2.get(i));
        }

        return arrayList;
    }
}
