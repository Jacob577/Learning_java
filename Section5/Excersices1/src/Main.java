public class Main {
    public static void main(String[] args) {

//        int count = 0;
//        int summarizing = 0;
//        for (int i = 1; i<= 1000; i += 1){
//            if (i%3 == 0 && i%5 == 0){
//                count ++;
//                summarizing += i;
//            }
//            if (count >= 5){
//                System.out.println("The sum is: " + summarizing);
//                break;
//            }
//        }
//        boolean doneForToday = true;
//        boolean isFriday = true;
//        int bear = 5;
//        int count = 0;
//        while (count != 5){
//            System.out.println("Count value is equal of: " + count);
//            count ++;
//        }

//        if (doneForToday) {
//            if (isFriday){
//                System.out.println("Drink beer");
//            } else if (!isFriday){
//                System.out.println("Drink a little beer");
//            }
//        }else doneForToday = true;
//        int count = 0;
//        do {
//            System.out.println("Count value was "+count);
//            count ++;
//        } while (count != 6);
//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber){
//            number ++;
//            if (!isEven(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }


    }






//    public static boolean isOdd(int number){
//        if (number <= 0){
//            return false;
//        } else if (number%2 != 0){
//            return true;
//        } return false;
//    }
//    public static int sumOdd(int first, int second){
//        if (first <=0 || second <= 0){
//            return -1;
//        } else if (second < first){
//            return -1;
//        }
//        int summarized = 0;
//        for (int i = first; i<=second;i++){
//            if (isOdd(i)){
//                summarized += i;
//            }
//
//        }
//        return summarized;
//    }
    public static boolean isEven(int n){
        if (n%2==0){
            return true;
        }
        return false;
    }
}
