//package exer_6;
//
//public class c {
//    public static void main(String[] args) {
//        int[] array = new int[100000];
//
//        initialize(array);
//
//        Stopwatch stopwatch = new Stopwatch();
//        stopwatch.startTime();
//
//        selectionSort(array);
//
//        stopwatch.endTime();
//
//        long longNumber = stopwatch.getElapsedTime();
//        System.out.println("long number is: " + longNumber);
//        MillisToTime millisToTime = new MillisToTime(longNumber);
//        System.out.println(millisToTime.getHrs() + ":" + millisToTime.getMinutes() + ":" + millisToTime.getSeconds());
//
//        displayArray(array);
//
//
//
//        MillisToTime millisToTime1 = new MillisToTime(System.currentTimeMillis());
//        System.out.println("hrs are: " + millisToTime1.getHrs() + " minutes are: " + millisToTime1.getMinutes() + " seconds are: " + millisToTime1.getSeconds());
//
//    }
//
//    private static void initialize(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 10);
//        }
//    }
//
//    private static void selectionSort(int[] array) {
//
//        int temp;
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            int smallest = array[i];
//            for (int j = i + 1; j < array.length; j++) {
//                if (smallest > array[j]) {
//                    smallest = array[j];
//                    index = j;
//                }
//            }
//            array[index] = array[i];
//            array[i] = smallest;
//
//        }
//    }
//
//    private static void displayArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//            if ((i + 1) % 10 == 0) {
//                System.out.println();
//            }
//        }
//    }
//}
