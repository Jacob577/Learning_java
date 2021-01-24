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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number #1: ");
        int one = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number #2: ");
        int two = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number #3: ");
        int three = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number #4: ");
        int four = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number #5: ");
        int five = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number #6: ");
        int six = scanner.nextInt();
        scanner.nextLine();
        int sum = one + two + three + four + five + six;
        System.out.println("The sum of these values are: " + sum);

        

    }
}
