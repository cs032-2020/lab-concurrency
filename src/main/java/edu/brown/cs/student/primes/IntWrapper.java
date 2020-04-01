package edu.brown.cs.student.primes;

/**
 * Class to wrap an integer. It provides a method to increment the integer.
 * TODO: [Part 3] Fix this class so increment() works concurrently.
 */

public class IntWrapper {
	private int _value;

	/**
	 *
	 * @param initialValue Starting value
	 */
	public IntWrapper(int initialValue){
		_value = initialValue;
	}

	/**
	 *
	 * @return Value stored in the wrapper
	 */
	public int get(){
		return _value;
	}

	/**
	 *
	 * @param val Value to set the wrapper to
	 */
	public void set(int val){
		_value = val;
	}

	/**
	 * Increments the value of the wrapper by 1
	 * TODO: [Part 3] Make increment thread-safe.
	 * Hint: use the synchronized keyword.
	 */
	public void increment() {
		_value++;
	}
}
