import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {

    public static void main(String[] args) {
        // Program 01: Declare Array
        int[] dataPoints = new int[100];

        // Program 02: Initialize Array with Random Values
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1; // Values from 1 to 100
        }

        // Program 03: Display Array Values
        System.out.println("Array values:");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(); // For a new line after the array display

        // Program 04: Calculate Sum and Average
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of dataPoints is: " + sum);
        System.out.println("The average of dataPoints is: " + average);

        // Program 05: Prompt User for a Value
        int userValue = getRangedInt("Enter a value between 1 and 100", 1, 100);

        // Program 06: Count Occurrences of User Value
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " times in dataPoints.");

        // Program 07: Find First Occurrence of User Value
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("The value " + userValue + " was found at array index " + position + ".");
        } else {
            System.out.println("The value " + userValue + " was not found in dataPoints.");
        }

        // Program 08: Find Minimum and Maximum Values
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int value : dataPoints) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        System.out.println("The minimum value in dataPoints is: " + min);
        System.out.println("The maximum value in dataPoints is: " + max);

        // Program 09: Calculate Average Using Static Method
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    // Static method to calculate the average of an int array
    public static double getAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }

    // Method to prompt user for an integer within a specified range
    public static int getRangedInt(String prompt, int low, int high) {
        Scanner in = new Scanner(System.in);
        int input;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            input = in.nextInt();
        } while (input < low || input > high);
        return input;
    }
}
