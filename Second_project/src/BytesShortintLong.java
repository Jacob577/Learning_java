public class BytesShortintLong {
    public static void main(String[] args) {

//        int myValue = 10000;
//        int myMin = Integer.MIN_VALUE;
//        int myMax = Integer.MAX_VALUE;

//        System.out.println("Minimum " + myMin);
//        System.out.println("myMax " + myMax);

//        byte myMinByteValue = Byte.MIN_VALUE;
//        byte myMaxByteValue = Byte.MAX_VALUE;
//        System.out.println("Byte Minimyum value = " + myMinByteValue);
//        System.out.println("Byte Maximum value = " + myMaxByteValue);

        //short can hold 16 bit
        //int can hold 32 bit
        //byte can hold 8 bit
        //Long has a size of 64 bits
//        long myLongValue = 100L;
//
//        long myMinByteValue = Long.MIN_VALUE;
//        long myMaxByteValue = Long.MAX_VALUE;
//        System.out.println("Byte Minimyum value = " + myMinByteValue);
//        System.out.println("Byte Maximum value = " + myMaxByteValue);

//        int myIntValue = 5;
//        int myTotal = (myIntValue/2);
//
//        byte myNewByteValue = (byte)(myTotal/2);

        //Casting is when I can put datatype in front of the value to use it as another

//        byte myByte = 100;
//        short myShort = 11111;
//        int myint = 10000;
//        long myLong = (50000L + 10L*(long)(myint + myByte + myShort));
//
//        System.out.println(myLong);

        //float can hold 32 bit
        //double can hold 64 bit

//        int myInt = 5/2;
//        float myFloat = 5f/2f;
//        double myDouble = 5d/2d;
//
//        System.out.println(myInt);
//        System.out.println(myFloat);
//        System.out.println(myDouble);

//        double amountOfPounds = 10d;
//        System.out.println(amountOfPounds/0.45359237d);

        //Can only store one letter per char
//        char myChar = 'D';
//        char myUnicode = '\u0044';
//
//        System.out.println(myUnicode);

//        String myString = "This is a string";
//
//        System.out.println(myString);

        //********************************************
        //Operators
//        ***********
//        int result = 1+2; //=3

//        int result = 1;
//        result++;
//        System.out.println(result);
//
//        result *= 10;
//        System.out.println(result);

//        boolean isAlien = false;
////        if (isAlien == false){
////            System.out.println("is ok");
//        }

//        int topScore = 80;
//        if (topScore == 100){
//            System.out.println(topScore==100);
//        }
//
//        int secondTopScore = 60;
//        if ((topScore > secondTopScore) && (topScore <100)){
//            System.out.println("This worked");
//        }
//
//        if ((topScore>90) || secondTopScore <= 90){
//            System.out.println("Second stuff works");
//        }

//        int newValue = 50;
//        if (newValue == 50){
//            System.out.println("This is a test of equals operator");
//        }

        //If a boolean in if: if (var=true = true) works because if wants a book. == returns a bool
        //Recommended to use !isCar in if statement

        //? checks if isCar is true, otherwise it assigns wasCar with false,
        //Shortening for if IsCar == true: was car = true, else wasCar = false
//        boolean isCar = false;
//        boolean wasCar = isCar ? true : false;
//        if (wasCar){
//            System.out.println("Was car is true");

        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double result = (myFirstDouble + mySecondDouble)*100d;

        double remainder = result%40;

        boolean isRemainder = (remainder == 0) ? true : false;

        if (!isRemainder){
            System.out.println("There was some remainder!");
        }

    }
}
