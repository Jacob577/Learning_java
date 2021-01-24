public class Main {
    public static void main(String[] args) {
//        System.out.println(sumDigit(1010));
//        System.out.println(sumDigit(125));
//        System.out.println(sumDigit(32123));
//        System.out.println(sumDigit(4));

//        System.out.println(isPalindrome(555));
//        System.out.println(getEvenDigitSum(122));
//        System.out.println(hasSharedDigit(99, 9111));
//        System.out.println(reverse(-123));

//        String numberAsString = "2020";
//        System.out.println("numberToString = " + numberAsString);
//
//        int number = Integer.parseInt(numberAsString);
//        System.out.println("This is a multiplication: " + number*5);
        //I can parse string to integer with class Integer with a method called parseInt.

    }
//    public static int sumDigit(int number){
//        if (number<10){
//            return -1;
//        }
//        int sum = 0;
//
//        while (number > 0){
//            int digit = number % 10;
//            sum += digit;
//            number /= 10;
//        }
//        return sum;
//    }

//    public static boolean isPalindrome(int number){
//        int oldNumber = number;
//        int newNumber = 0;
//        int count = 0;
//
//        while (true){
//
//            number /= 10;
//            if ((int)number != 0){
//                count ++;
//                continue;
//            }
//            break;
//        }
//        System.out.println("Count is: " + count);
//        number = oldNumber;
//        while (number!=0){
//            int lastDiget = number%10;
//            newNumber += lastDiget*(Math.pow(10,count));
//            System.out.println("newNumber is " + newNumber);
//            count--;
//            number /= 10;
//        }
//        if (newNumber == oldNumber){
//            return true;
//        }
//        System.out.println(newNumber);
//        return false;
//
//    }
//    public static int sumFirstAndLastDigit(int number){
//        int firstDigit = 0;
//        int lastDigit = number%10;
//        if (number<0){
//            return -1;
//        }
//        while (number != 0) {
//            if ((int)(number/10) == 0){
//                firstDigit = number;
//            }
//            number /= 10;
//        }
//
//        return firstDigit + lastDigit;
//    }
//    public static int getEvenDigitSum(int number){
//        int sum = 0;
//        int digit = 0;
//        if (number < 0){
//            return -1;
//        }
//
//        while ((int)number != 0){
//            digit = number%10;
//            if (digit%2 == 0){
//                sum += digit;
//            }
//            number /= 10;
//        }
//        return sum;
//    }
//    public static boolean hasSharedDigit(int firstDigit, int secondDigit){
//        int digit = 0;
//        int oldSecondDiget = secondDigit;
//
//        if (secondDigit < 10 || firstDigit < 10 || secondDigit > 99 || firstDigit > 99){
//            return false;
//        }
//
//        while((int)firstDigit != 0){
//            secondDigit = oldSecondDiget;
//            while ((int)secondDigit != 0){
//                if (firstDigit%10 == secondDigit%10){
//                    return true;
//                }
//                secondDigit /= 10;
//            }
//            firstDigit /= 10;
//        }
//        return false;
//    }
//    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
//        if (isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)){
//            int firstNumberLastDiget = firstNumber%10;
//            int secondNumberLastDigit = secondNumber%10;
//            int thirdNumberLastDigit = thirdNumber%10;
//
//            if (firstNumberLastDiget == secondNumberLastDigit || firstNumberLastDiget == thirdNumberLastDigit || secondNumberLastDigit == thirdNumberLastDigit){
//                return true;
//            }
//        }
//
//        return false;
//    }
//    public static boolean isValid(int number){
//        if (number >= 10 && number <= 1000){
//            return true;
//        }return false;
//    }
//    public static int getGreatestCommonDivisor(int first, int second){
//        if (first<10 || second<10){
//            return -1;
//        }
//        int divisor = 0;
//        for (int i = 1; i <= first; i++){
//            for (int j = 1; j <= second; j++){
//                if (first%i == 0 && second%j == 0 && i==j){
//                    divisor = i;
//                }
//            }
//        }
//
//        return divisor;
//    }
//    public static void printFactors(int number){
//        if (number < 1){
//            System.out.println("Invalid Value");
//        }
//        if (number >= 1){
//            for (int i = 1; i<=number; i ++){
//                if (number%i == 0){
//                    System.out.println(i);
//
//                }
//            }
//        }
//    }

//    public static boolean isPerfectNumber(int number){
//        int sum = 0;
//        if (number<=0){
//            return false;
//        }
//
//        for (int i = 1; i<number; i++){
//            if (number%i == 0){
//                sum += i;
//            }
//        }
//        if (number == sum){
//            return true;
//        }
//        return false;
//    }
//    public static int getDigitCount(int number){
//        int count = 0;
//        if (number == 0){
//            return 1;
//        }
//        while ((int)number != 0){
//            count ++;
//            number /= 10;
//        }
//        return count;
//    }
//
//    public static int reverse(int number){
//        int count = getDigitCount(number) -1;
//        int oldNumber = number;
//        int newNumber = 0;
//
//        while (true){
//            number /= 10;
//            if ((int)number != 0){
//                count ++;
//                continue;
//            }
//            break;
//        }
//       while (number!=0){
//            int lastDiget = number%10;
//            newNumber += lastDiget*(Math.pow(10,count));
////            System.out.println("newNumber is " + newNumber);
//            count--;
//            number /= 10;
//        } return newNumber;
//    }
//
//    public static void numberToWords(int number){
//        int digit = 0;
//        while (number!=0){
//            digit = number%10;
//            number /= 10;
//
//            switch (number){
//                case 0:
//                    System.out.println("ZERO");
//                    break;
//
//                case 1:
//                    System.out.println("ONE");
//                    break;
//
//                case 2:
//                    System.out.println("TWO");
//                    break;
//
//                case 3:
//                    System.out.println("THREE");
//                    break;
//
//                case 4:
//                    System.out.println("FOUR");
//                    break;
//
//                case 5:
//                    System.out.println("FIVE");
//                    break;
//
//                case 6:
//                    System.out.println("SIX");
//                    break;
//
//                case 7:
//                    System.out.println("SEVEN");
//                    break;
//
//                case 8:
//                    System.out.println("EIGHT");
//                    break;
//
//                case 9:
//                    System.out.println("NINE");
//                    break;
//
//                default:
//                    System.out.println("Invalid Value");
//                    break;
//            }
//        }
//
//    }

}
