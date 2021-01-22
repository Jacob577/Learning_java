import java.lang.management.MemoryType;

public class Calculations {
    public static void main(String[] args) {
//        double kilometersPerHour = 1.5;
//        printConversion(kilometersPerHour);
//        int kiloByte = 2500;
//        printMegaBytesAndKiloBytes(kiloByte);
//        int year = 1924;
//        isLeapYear(year);
//        System.out.println(isLeapYear(year));
//        double first = 3.1756;
//        double second = 3.175;
//        areEqualByThreeDecimalPlaces(first,second);
//        System.out.println(calcFeetAndInchesToCentimeters(3,8));
//        System.out.println(area(5));

    }


//        public static long toMilesPerHour(double kilometerPerHour){
//        if (kilometerPerHour>=0){
//            return Math.round(kilometerPerHour/1.609);
//        } else {
//            return -1;
//        }
//
//    }
//    public static void printConversion(double kilometersPerHour){
//        if (kilometersPerHour >= 0){
//            long milesPerHourRounded = toMilesPerHour(kilometersPerHour);
//            double kilometersround = kilometersPerHour;
//
//            System.out.println(kilometersround + " km/h = " + milesPerHourRounded + " mi/h");
//        } else {
//            System.out.println("Invalid Value");
//        }
//
//    }

//    public static void printMegaBytesAndKiloBytes(int kiloBytes){
//        if (kiloBytes>=0){
//            int kiloBytesRest = kiloBytes%1024;
//            int megaBytes = kiloBytes/1024;
//            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesRest + "KB");
//        } else {
//            System.out.println("Invalid Value");
//        }
//    }
//    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
//        if (!barking){
//            return false;
//        } else if (hourOfDay >= 8 && hourOfDay <= 22){
//            return false;
//        } else if (hourOfDay > 23 || hourOfDay < 0){
//            return false;
//        }
//        return true;

//    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
//        double firstNumberModified = (int)(firstNumber*1000);
//        double secondNumberModified = (int)(secondNumber*1000);
////        System.out.println(firstNumberModified);
////        System.out.println(secondNumberModified);
//        if (firstNumberModified/1000 == secondNumberModified/1000){
//            return true;
//        } else {
//            return false;
//        }
//
//    }
//    public static boolean hasEqualSum(int first, int second, int sum){
//        if (first + second == sum){
//            return true;
//        }
//        return false;
//    }
//    public static boolean hasTeen(int first, int second, int third){
//        if (isTeen(first) || isTeen(second) || isTeen(third)) {
//            return true;
//        }
//        return false;
//    }
//    public static boolean isTeen(int age){
//        if (age <= 19 && age >= 13){
//            return true;
//        }
//        return false;

//    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
//        if (feet < 0 || inches > 12 || inches < 0){
//            return -1;
//        }
//        return feet*30.48 + inches*2.54;
//    }
//    public static double calcFeetAndInchesToCentimeters(int inches){
//        if (inches<0){
//            return -1;
//        }
//        double inchesRest = inches%12;
//        double feet = (inches/12);
//
//        return calcFeetAndInchesToCentimeters(feet,inchesRest);
//    }

//    public static double area(double radious){
//        if (radious < 0){
//            return -1;
//        }
//        return Math.PI*radious*radious;
//    }
//    public static double area(double x, double y){
//        if (x < 0 || y < 0){
//            return -1;
//        }
//        return x*y;
//    }

//    public static void printYearsAndDays(long minutes){
//        if (minutes<0){
//            System.out.println("Invalid Value");
//        } else if (minutes>=0){
//            int year = (int)minutes/(60*24*365);
//            int day = (int)((minutes - year*365*24*60)/(24*60));
//            System.out.println(minutes + " min = " + year +" y and " + day + " d");
//        }
//
//    }
//    public static void printEqual(int first, int second, int third){
//        if (first < 0 || second < 0 || third < 0){
//            System.out.println("Invalid Value");
//        } else if ((first == second) && (second == third)){
//            System.out.println("All numbers are equal");
//        } else if ((first == second)||(second == third)||(first == third)){
//            System.out.println("Neither all are equal or different");
//        } else if ((first != second) && (second != third) && (first != third)){
//            System.out.println("All numbers are different");
//        }
//    }
//    public static boolean areEqual(int first, int second){
//        if (first != second){
//            return false;
//        } return true;
//    }
//    public static boolean isCatPlaying(boolean summer, int temperature){
//        if (summer){
//            if (temperature<=45 && temperature>=25){
//                return true;
//            }
//        }else if (temperature >= 25 && temperature <= 35){
//            return true;
//        }
//        return false;
//    }
}

//    public static boolean isLeapYear(int year){
//        if (year < 9999 && year > 1){
//            if (year%4 == 0){
//                if (year%100 == 0){
//                    if (year%400 == 0){
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;





