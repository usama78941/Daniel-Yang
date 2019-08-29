package exer_6;


public class TestProgram {
    public static void main(String[] args) {
        int[] array = new int[100000];

        initialize(array);

        Stopwatch stopwatch = new Stopwatch();
        stopwatch.startTime();

        selectionSort(array);

        stopwatch.endTime();
        System.out.println("Total milliseconds: " + stopwatch.getElapsedTime());
    }

    private static void initialize(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    private static void selectionSort(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int smallest = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (smallest > array[j]) {
                    smallest = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = smallest;

        }
    }
}
