package exer_3;

import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        long integer = 10000;

        while (integer <= 100000000000L) {
            Date date = new Date(integer);
            System.out.println(date.toString());
            integer *= 10;
        }
    }
}
