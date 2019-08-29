package exer_6;

import java.util.Date;

public class Stopwatch {
    private long startTime;
    private long endTime;
    private static final long millis = new Date().getTime();

    public Stopwatch() {
        startTime = millis;
    }

    public void startTime(){
        startTime = new Date().getTime();
    }

    public void endTime(){
        endTime = new Date().getTime();
    }

    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getElapsedTime(){
        return endTime - startTime;
    }
}
