package com.pluralsight;

import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input: Loan Amount, interest and number of years
        System.out.println("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.println("Enter the interest rate: ");
        double annualRate = scanner.nextDouble();

        System.out.println("Enter the loan term (in years): ");
        int years = scanner.nextInt();

        double monthlyRate = (annualRate / 100) / 12;

        int numberOfPayments = years * 12;

        double monthlyPayment = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) /
                                (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
        double totalPayment = monthlyPayment * numberOfPayments;
        double totalInterest = totalPayment - loanAmount;

        // Output: Display Result

        System.out.println("Loan Amount: $" + loanAmount);
        System.out.println("Interest Rate: " + (annualRate * 100) + "%");
        System.out.println("Monthly Payment: " + monthlyPayment);

        scanner.close();

    }
}
