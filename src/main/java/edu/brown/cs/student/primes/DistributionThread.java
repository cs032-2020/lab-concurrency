package edu.brown.cs.student.primes;

import java.util.concurrent.atomic.AtomicInteger;

import edu.brown.cs.student.util.PrimeCalculator;

/**
 * Work Distribution Thread class for Part 4. Checks prime on unchecked numbers from work queue.
 */

public class DistributionThread extends Thread {
	public static final int MAX_NUMBER = 8000000;

	private AtomicInteger _workQueue;
	private IntWrapper _counter;

	public DistributionThread(AtomicInteger workQueue, IntWrapper counter) {
		_workQueue = workQueue;
		_counter = counter;
	}

	/**
	 * Method that will be called when the thread is started. 
	 * Looks through all the values up to MAX_NUMBER and increments the counter every time a prime is found.
	 */
	@Override
	public void run() {
		/** TODO: [Part 4] 
		 * Fill this in to counter the number of primes up to MAX_NUMBER.
		 * Instead of having each thread have a range of values to check, 
		 * all threads will have a shared atomic integer.
		 * A single thread should getAndIncrement() the atomic integer,
		 * check the value that is returned for primality, increment the counter if prime, 
		 * and finally stop when the max value is reached or exceeded.
		 *
		**/
	}

}
