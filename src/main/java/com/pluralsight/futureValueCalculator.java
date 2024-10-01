package com.pluralsight;
import java.util.Scanner;
public class futureValueCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input: Deposit, interest and number of years
        System.out.println("Deposit Amount: ");
        double valueAmount = scanner.nextDouble();

        System.out.println("Interest Rate: ");
        double annualYear = scanner.nextDouble();

        System.out.println("Enter Number of Years: ");
        int numberOfYears = scanner.nextInt();

        double dailyRate = (annualYear / 100) / 365;

        int numberOfDays = numberOfYears * 365;

        double futureValue = valueAmount * Math.pow(1 + dailyRate, numberOfDays);

        double totalInterest = futureValue - valueAmount;

        // Output: Display Result

        System.out.println("Future Value: $%.2f%n " + futureValue);
        System.out.println("Total Interest Earned: " + totalInterest);

        scanner.close();


    }
}
