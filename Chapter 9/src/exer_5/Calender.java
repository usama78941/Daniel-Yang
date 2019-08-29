package exer_5;

import java.util.GregorianCalendar;

public class Calender {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println("The current year is: " + gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println("The current month is: " + gregorianCalendar.get(GregorianCalendar.MONTH));
        System.out.println("The day of month is: " + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));

        long integer = 1234567898765L;

        gregorianCalendar.setTimeInMillis(integer);
        System.out.println("The current year is: " + gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println("The current month is: " + gregorianCalendar.get(GregorianCalendar.MONTH));
        System.out.println("The day of month is: " + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));


    }
}
