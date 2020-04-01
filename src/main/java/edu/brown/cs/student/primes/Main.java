package edu.brown.cs.student.primes;

import java.util.concurrent.atomic.AtomicInteger;
import edu.brown.cs.student.util.PrimeCalculator;
import edu.brown.cs.student.util.Profiler;

/**
 * Main class. Prints the number of primes in the range [1, MAX_NUMBER_TO_TEST).
 */
public class Main {
	public static final int MAX_NUMBER_TO_TEST = 8000000;

	public static void main(String [] argv){
		Profiler p = Profiler.getInstance();
		p.startProfiling();

		int numprimes = 0;
		/** TODO: [Part 1] Naively count the number of primes less than MAX_NUMBER_TO_TEST, and store it in numprimes*/


		/** TODO: [Part 2] Count the number of primes less than MAX_NUMBER_TO_TEST using 4 separate threads.
		 * In order to count the number of primes using several threads, we give each thread a shared counter and
		 * each thread will increment that counter. Each thread also gets some range of numbers to test for primality.
		 * The final value of the counter will be the total number of primes.
		 *
		 * Pseudocode:
		 * create a shared counter (use IntWrapper)
		 * create 4 threads (use PrimeCalcThread)
		 * start the threads
		 * join the threads
		 *
		 * store the final result in numprimes
		 */


		/** TODO: [Part 4] Count the number of primes less than MAX_NUMBER_TO_TEST using 4 separate threads.
		 * You will have to write your own thread class for this part.
		 * Instead of having each thread have a range of values to check, each will have a shared atomic integer.
		 * Each thread should getAndIncrement() the atomic integer, and check the value that is returned, stopping
		 * when the max value is reached or exceeded.
		 *
		 * Pseudocode:
		 * create a shared counter (use your concurrent IntWrapper)
		 * create a shared atomic integer
		 * create 4 threads
		 * start the threads
		 * join the threads
		 *
		 * store the final result in numprimes
		 */


		//DO NOT TOUCH CODE BELOW THIS LINE
		System.out.println("The number of prime numbers less than " + MAX_NUMBER_TO_TEST + " is " + numprimes);
		p.stopProfiling();
		System.out.println(String.format("Results found in %o ms", p.getProfiledTime()));
	}
}
