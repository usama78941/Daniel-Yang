package exer_13;

public class Location {
    public int row, column;
    public double maxValue;

    public String result() {
        return "The location of the largest element " + maxValue + " is: (" + row + ", " + column + ")";
    }

    public static Location locateLargest(int[][] array) {
        int row = 0, column = 0;
        double maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxValue < array[i][j]) {
                    maxValue = array[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        Location location = new Location();
        location.row = row;
        location.column = column;
        location.maxValue = maxValue;
        return location;
    }


    public static void main(String[] args) {
        int[][] array = new int[(int) (3 + Math.random() * 8)][(int) (3 + Math.random() * 8)];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 20);
            }
        }
        Location location = Location.locateLargest(array);
        System.out.println(location.result());
        displayArray(array);
    }

    private static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
