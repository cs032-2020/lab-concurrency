package edu.brown.cs.student.primes;

import edu.brown.cs.student.util.PrimeCalculator;

/**
 * Prime Calc Thread class for Part 2. Checks and counts primes between a min and max bound. 
 */
public class PrimeCalcThread extends Thread{
	private int _min, _max;
	private IntWrapper _counter;
	
	/**
	 * 
	 * @param min Lowest number to check
	 * @param max Highest number to check plus 1
	 * @param counter IntegerWrapper to increment when a prime is found
	 */
	public PrimeCalcThread(int min, int max, IntWrapper counter){
		_min = min;
		_max = max;
		_counter = counter;
	}
	
	/**
	 * Method that will be called when the thread is started. Looks through all the values in the range [min, max) and increments the counter every time a prime is found.
	 */
	@Override
	public void run(){
		/** TODO: [Part 2] Fill this in to count the number of primes between min and max (not including max).
		* Counting should be done by incrementing the counter.
		*/

	}
}
