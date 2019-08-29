package exer_14;

import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        this(new GregorianCalendar().get(GregorianCalendar.YEAR), new GregorianCalendar().get(GregorianCalendar.MONTH) + 1, new GregorianCalendar().get(GregorianCalendar.DAY_OF_MONTH));
    }

    public MyDate(long elapsedTime) {
        GregorianCalendar gregorianCalendar = get(elapsedTime);
        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = gregorianCalendar.get(GregorianCalendar.MONTH) + 1;
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar gregorianCalendar = get(elapsedTime);
        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = gregorianCalendar.get(GregorianCalendar.MONTH) + 1;
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    private GregorianCalendar get(long elapsedTime) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(elapsedTime);
        return gregorianCalendar;
    }

    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        MyDate myDate1 = new MyDate(34355555133101L);
        MyDate myDate2 = new MyDate(561555550000L);

        System.out.println(myDate.getYear() + ":" + myDate.getMonth() + ":" + myDate.getDay());
        System.out.println(myDate1.getYear() + ":" + myDate1.getMonth() + ":" + myDate1.getDay());
        System.out.println(myDate2.getYear() + ":" + myDate2.getMonth() + ":" + myDate2.getDay());
    }
}