import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your year of birth: ");
//
//        boolean hasNextInt = scanner.hasNextInt();
//        //Check if scanner input is an integer!
//        if (hasNextInt){
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//            int age = 2020 -yearOfBirth;
//            if (age >= 0 && age <= 100){
//                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
//            } else {
//                System.out.println("Invalid year of birth");
//            }
//        } else {
//            System.out.println("Unable to pars year of birth.");
//        }
//        scanner.close();
//        int count = 0;
//        int sum = 0;
//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            int order = count + 1;
//            System.out.println("Enter number #" + order + ": ");
//            boolean isAnInt = scanner.hasNextInt();
//            //has next int is checking if the scanner has recieved an integer.
//
//            if (isAnInt){
//                int number = scanner.nextInt();
//                count++;
//                sum += number;
//                if (count == 10) {
//                    break;
//                }
//
//            } else {
//                System.out.println("Invalid Number");
//            }
//            scanner.nextLine(); // Handle end of line.
//        }
//        System.out.println("Sum equals: "+ sum);
//        scanner.close();
//        int min = Integer.MIN_VALUE;
//        int max = Integer.MAX_VALUE;
//        boolean first = true;

//        Scanner scanner = new Scanner(System.in);
//
//        while (true){
//            int digit = 0;
//            System.out.println("Enter a number: ");
//            boolean isAnInt = scanner.hasNextInt();
//
//            if (isAnInt){
//                digit = scanner.nextInt();
//
////                if (first){
////                    min = digit;
////                    max = digit;
////                    first = false;
////                }
//
//                if (digit > max){
//                    max = digit;
//                } else if (digit < min){
//                    min = digit;
//                }
//            } else {
//                System.out.println("Maximum number was: " + max);
//                System.out.println("Minimum number was: " + min);
//                break;
//            }
//        } scanner.close();
//        inputThenPrintSumAndAverage();

//        System.out.println(getBucketCount(3.4,2.1, 1.5,2));
        System.out.println(getBucketCount(7.25,4.3, 2.35));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <=0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double totalArea = width * height;

        return (int)((totalArea - areaPerBucket*extraBuckets)/areaPerBucket + 1);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <=0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double totalArea = width * height;

        return (int)((totalArea)/areaPerBucket) + 1;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return (int)((area)/areaPerBucket) + 1;
    }

//    public static void inputThenPrintSumAndAverage(){
//        Scanner scanner = new Scanner(System.in);
//        int count = 0;
//        int sum = 0;
//
//
//        while (true){
//            System.out.println("Please enter a number: ");
//            boolean isAnInt = scanner.hasNextInt();
//            if (isAnInt){
//                count++;
//                sum += scanner.nextInt();
//            } else {
//                System.out.println("SUM = " + sum + " AVG = " + (sum/count));
//                break;
//            }
//        } scanner.close();
//    }
}
