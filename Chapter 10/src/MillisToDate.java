public class MillisToDate {
    private long millis;

    public MillisToDate(long elapsedTime) {
        this.millis = elapsedTime;
    }

    public void setMillis(long millis) {
        this.millis = millis;
    }

    public long getMillis() {
        return millis;
    }

    public int getDate() {

    }

    public int getMonth() {
        return (int) ((millis % 31536000) % 12) + 1;
    }

    public int getYear() {
        return (int) (millis / 31536000) + 1970;
    }

    @Override
    public String toString() {
        return getDate() + ":" + getMonth() + ":" + getYear();
    }


    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        millis = millis / 1000; //converting from milliseconds to **SECONDS**
        int year = (int) (millis / 31536000) + 1970;
        int month = (int) (((millis % 31536000) % 12) + 1);
    }


}
