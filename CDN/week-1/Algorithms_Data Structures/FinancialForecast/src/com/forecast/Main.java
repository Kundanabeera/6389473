package com.forecast;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial investment amount (₹): ");
        double initialInvestment = scanner.nextDouble();

        System.out.print("Enter annual growth rate (%): ");
        double annualRatePercent = scanner.nextDouble();
        double annualRate = annualRatePercent / 100;

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double futureValRec = ForecastCalculator.futureValueRecursive(initialInvestment, annualRate, years);
        System.out.printf("\nFuture Value (Recursive): ₹%.2f\n", futureValRec);

        double[] memo = new double[years + 1];
        double futureValMemo = ForecastCalculator.futureValueMemoized(initialInvestment, annualRate, years, memo);
        System.out.printf("Future Value (Memoized): ₹%.2f\n", futureValMemo);

        scanner.close();
    }
}
