import java.lang.management.MemoryType;

public class Calculations {
    public static void main(String[] args) {
//        double kilometersPerHour = 1.5;
//        printConversion(kilometersPerHour);
//        int kiloByte = 2500;
//        printMegaBytesAndKiloBytes(kiloByte);
        int year = 1924;
        isLeapYear(year);
        System.out.println(isLeapYear(year));

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

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes>=0){
            int kiloBytesRest = kiloBytes%1024;
            int megaBytes = kiloBytes/1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesRest + "KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (!barking){
            return false;
        } else if (hourOfDay >= 8 && hourOfDay <= 22){
            return false;
        } else if (hourOfDay > 23 || hourOfDay < 0){
            return false;
        }
        return true;
    }
    public static boolean isLeapYear(int year){
        if (year < 9999 && year > 1){
            if (year%4 == 0){
                if (year%100 == 0){
                    if (year%400 == 0){
                        return true;
                    }
                }
            }
        }
        return false;
    }

}

