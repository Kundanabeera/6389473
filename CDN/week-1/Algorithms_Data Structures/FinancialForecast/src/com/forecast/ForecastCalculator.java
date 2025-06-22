package com.forecast;

public class ForecastCalculator {

    public static double futureValueRecursive(double initialValue, double rate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return futureValueRecursive(initialValue, rate, years - 1) * (1 + rate);
    }

    public static double futureValueMemoized(double initialValue, double rate, int years, double[] memo) {
        if (years == 0) return initialValue;
        if (memo[years] != 0) return memo[years];
        memo[years] = futureValueMemoized(initialValue, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }
}
