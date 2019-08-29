package exer_1;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        long elapsedTime = System.currentTimeMillis();
        elapsedTime /= 1000;
        this.second = (int) elapsedTime % 60;
        elapsedTime /= 60;
        this.minute = (int) (elapsedTime % 60);
        elapsedTime /= 60;
        this.hour = (int) (elapsedTime % 24);

    }

    public Time(long elapsedTime){
        elapsedTime /= 1000;
        this.second = (int) elapsedTime % 60;
        elapsedTime /= 60;
        this.minute = (int) (elapsedTime % 60);
        elapsedTime /= 60;
        this.hour = (int) (elapsedTime % 24);

    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        elapsedTime /= 1000;
        this.second = (int) elapsedTime % 60;
        elapsedTime /= 60;
        this.minute = (int) (elapsedTime % 60);
        elapsedTime /= 60;
        this.hour = (int) (elapsedTime % 24);
    }

    public String toString(){
        return getHour() + ":" + getMinute() + ":"  + getSecond();
    }

    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time.toString());
        Time time1 = new Time(555550000);
        System.out.println(time1.toString());
    }
}
