public class Exercises {
    public static void main(String[] args) {
//        System.out.println(getLargestPrime(7));
//        printSquareStar(5);
    }

//    public static boolean canPack(int bigCount, int smallCount, int goal){
//        if (goal <= 0){
//            System.out.println("Got to step 0");
//            return false;
//        }
//        while (goal>0){
//            if (goal/5 >= 1 && bigCount > 0){
//                goal -= 5;
//                bigCount -= 1;
//                if (goal == 0){
//                    return true;
//                }
//                continue;
//
//            } else if (goal>0 && smallCount > 0){
//                goal -= 1;
//                smallCount --;
//                System.out.println("Got to step 2");
//                if (goal == 0){
//                    return true;
//                }
//                continue;
//
//            } else if (goal == 0){
//                return true;
//            } break;
//        } return false;
//    }
//    public static int getLargestPrime(int number){
//        if (number <= 1){
//            return -1;
//        } else {
//            int div = 2;
//            while (div < number){
//                if (number % div != 0){
//                    div++;
//                } else {
//                    number /= div;
//                    div = 2;
//                }
//            } return number;
//        }
//    }
//    public static void printSquareStar(int number){
//        if (number >= 5){
//            for (int i = 0; i < number; i++){
//                for (int j = 0; j < number; j++){
//                    if (i == 0 || (number -1) == i) {
//                        System.out.print("*");
//                    } else if (j == 0 || j == (number-1)){
//                        System.out.print("*");
//                    } else if (j == i) {
//                        System.out.print("*");
//                    } else if(j == (number - i -1)){
//                        System.out.print("*");
//                    } else{
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println(" ");
//            }
//        } else {
//            System.out.println("Invalid Value");
//        }
//    }
}
