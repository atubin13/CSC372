package Mod5CT;

import java.util.Scanner;

public class RecursionSumCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for inputs

        System.out.println("Enter 5 numbers, one at a time: "); // User instruction
        int[] numbers = new int[5]; // Create the list
        int currentIndex = 0;

        while (currentIndex < 5) { // If statement to initiate recursion
            System.out.println("Enter number " + (currentIndex + 1) + ": "); //User input
            numbers[currentIndex] = scanner.nextInt();
            currentIndex++;
        }

            int sum = calcSum(numbers, 0); // Print the sum when recursion is complete
            System.out.println("the sum of the five numbers is: " + sum);
        }

    public static int calcSum(int[] numbers, int index) {
        if (index == numbers.length -1) {
            return numbers[index];
        } else {
            return numbers[index] + calcSum(numbers, index + 1);
        }
    }
}
