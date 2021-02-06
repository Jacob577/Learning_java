import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int[] myIntegers = getIntegers(5);
//        for (int i=0; i<myIntegers.length; i++){
//            System.out.println("Element " + i + "type values was " + myIntegers[i]);
//        }
//        System.out.println("The average is "+ getAverage(myIntegers));
//        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//        myIntArray[5] = 50;
//        int[] myIntArray = new int[10];
//
//        for (int i = 0; i<myIntArray.length; i++){
//            myIntArray[i] = i*10;
//        }
//        printArray(myIntArray);
//    }
//    public static void printArray(int[] array){
//        for (int i = 0; i < array.length; i++){
//            System.out.println("Element " + i + " value is " + array[i]);
//
//        }
        int[] myArray = createArray(5);
        sortArray(myArray);
        for (int i = 0; i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }
    public static int[] createArray(int numberOfElements){
        System.out.println("How many elements would you like ypur array to contain?");
        int[] myArray = new int[numberOfElements];
        for (int i = 0; i<myArray.length;i++){
            System.out.println("Please enter a number");
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }
    public static int[] sortArray(int[] unsortedArray){
        int cost = 0;
        int[] sortedArray = unsortedArray;
        int number = 0;
        boolean running = true;

        while (running){
            int count = 0;
            for (int i = 1; i<sortedArray.length; i++){
                cost ++;
                if (sortedArray[i-1]<sortedArray[i]){
                    number = sortedArray[i-1];
                    sortedArray[i-1] = sortedArray[i];
                    sortedArray[i] = number;
                    count ++;
                    continue;
                }
            }
            if (count==0){
                running = false;
                System.out.println("The cost is "+cost);
            }
        }
        return sortedArray;
    }

//    public static int[] getIntegers(int number){
//        System.out.println("Enter " + number + " integer values \r");
//        int[] values = new int[number];
//
//        for (int i = 0; i<values.length; i++){
//            values[i] = scanner.nextInt();
//        }
//        return values;
//    }

//    public static double getAverage(int[] array){
//        int sum = 0;
//        for (int i = 0; i<array.length;i++){
//            sum += array[i];
//        }
//        return (double) sum / (double)array.length;
//    }
}
