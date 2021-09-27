package com.dkit.gd2.johnloane;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Primitives
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        final float WEIGHT_IN_POUNDS = 100f;
        //investigateIntegers();
        //investigateBytes();
        //investigateShorts();
        //investigateLongs();
        //investigateFloats();
        //investigateDoubles();
        //investigateChars();
        //investigateBooleans();
        //investigateStrings();
        //testTypedDivision();
        float weightInPounds = getWeightInPounds(keyboard);
        System.out.printf("%.1f", convertPoundsKilos(WEIGHT_IN_POUNDS));


        /*int score = 65535;
        printBinary(score);*/

    }

    private static float convertPoundsKilos(float weight_in_pounds)
    {
        final float KILOS_IN_POUND = 0.45359237f;
        return weight_in_pounds*KILOS_IN_POUND;
    }

    private static void testTypedDivision()
    {
        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

    }

    private static void investigateStrings()
    {
        //A String is not a primitive type
        //It is a class
        String myString = "This is a string";
        System.out.println("The myString variable is " + myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);
        myString += " \u00A9 2021";
        System.out.println(myString);
        String numberString = "20.99";
        numberString += "19.01";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        int convertedInt = Integer.parseInt(lastString);
        System.out.println(myInt + convertedInt);

        double doubleNumber = 120.47d;
        double convertedDouble = (double)(convertedInt);
        doubleNumber += (double)(convertedInt);
        System.out.println(lastString);


    }

    private static void investigateBooleans()
    {
        boolean isOverEighteen = true;
        boolean isEmployed = false;
    }

    private static void investigateChars()
    {
        char myChar = 'A';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char copyrightChar = '\u00A9';
        System.out.println(copyrightChar);

    }

    private static void investigateFloats()
    {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        float score = -5.5f;
        System.out.println(score);

        System.out.println("Max is " + myMaxFloatValue + " Min is " + myMinFloatValue);
    }

    private static void investigateDoubles()
    {
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        double score = -5.5;
        System.out.println(score);

        System.out.println("Max is " + myMaxDoubleValue + " Min is " + myMinDoubleValue);
    }

    private static void investigateLongs()
    {
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println(convertMaxLongToDays(myMaxLongValue));

        System.out.println("Max is " + myMaxLongValue + " Min is " + myMinLongValue);

        long bigValue = 2_147_987_777L;
        System.out.println(bigValue);
    }

    private static long convertMaxLongToDays(long myMaxLongValue)
    {
        return myMaxLongValue/(24*60*60*1000*365);
    }

    private static void investigateShorts()
    {
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Max is " + myMaxShortValue + " Min is " + myMinShortValue);
    }

    private static void investigateBytes()
    {
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Max is " + myMaxByteValue + " Min is " + myMinByteValue);
    }

    private static void printBinary(int score)
    {
        System.out.println(Integer.toBinaryString(score));
    }

    private static void investigateIntegers()
    {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println(myMaxIntValue + 1);
        System.out.println(myMinIntValue - 1);

        System.out.println(myMaxIntValue);
        System.out.println(myMinIntValue);

    }


}
