public class MillisToTime {
    private int seconds;
    private int minutes;
    private int hrs;
    private long milliSeconds;

    MillisToTime(long milliSeconds) {
        this.milliSeconds = milliSeconds / 1000;
        changeMethod();
    }

    private void changeMethod() {
        seconds = (int) (milliSeconds % 60);
        milliSeconds = milliSeconds / 60;
        minutes = (int) milliSeconds % 60;
        milliSeconds = milliSeconds / 60;
        hrs = (int) milliSeconds % 24;
        hrs += 5; // GMT +05
    }

    int getSeconds() {
        return seconds;
    }

    int getMinutes() {
        return minutes;
    }

    int getHrs() {
        return hrs;
    }
}
