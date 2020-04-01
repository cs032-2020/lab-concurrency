package edu.brown.cs.student.util;

public final class PrimeCalculator {
    
    private PrimeCalculator() {}

    public static boolean isPrime(int num) {
        // 1 is considered prime in our implementation. 
        if (num == 1) {
            return true;
        }

        int i = 2; 

        // This will loop from 2 to int(sqrt(num))
        while (i * i <= num) {
            // This checks if num has a factor between 2 and sqrt(n).
            // If this is true, num is not a prime. 
            if (num % i == 0) {
                return false;
            }
            i++;
        }

        // If we didn't find a factor in the above loop, num is prime. 
        return true;
    }
}