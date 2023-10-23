package Mod5CT;

import java.util.Scanner;

public class RecursionSumCalc {
    private static final int inputs = 5;
    private static final Scanner scanner = new Scanner(System.in);
    private static final double[] numbers = new double[inputs];

    public static void main(String[] args) {
        System.out.println("Please enter five numbers, one at a time:"); // User input integers
        enterNumbers(numbers, 0);

        double sum = calcSum(numbers, 0);

        System.out.println("The sum of the five numbers is: " + sum); // Sum of user input integers
    }

    public static void enterNumbers(double[] numbers, int index) {
        if (index < inputs) {
            System.out.print("Enter number " + (index + 1) + ": "); // Iterate through the loop
            numbers[index] = scanner.nextDouble();
            enterNumbers(numbers, index + 1);
        }
    }

    public static double calcSum(double[] numbers, int index) {
        if (index == inputs - 1) {
            return numbers[index];
        } else {
            return numbers[index] + calcSum(numbers, index + 1);
        }
    }
}
