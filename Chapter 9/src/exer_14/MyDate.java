package exer_14;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {

    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(long elapsedTime){
        //code to write here
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(long elapsedTime){
        // code to write here
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }



}
