package cse360assign3;
/**
 * Calculator class that can perform the 4 basic math operations. History of operations
 * is recorded.
 * @author Brett Bauman
 * PIN: 117
 *
 */
public class Calculator {

	private int total;
	
	/**
	 * Creates an integer total
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Get the total value
	 * @return	Value of total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds parameter to total
	 * @param value integer to be added
	 */
	public void add (int value) {
		total += value;		
	}
	
	/**
	 * Subtracts parameter from total
	 * @param value integer to be subtracted
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/**
	 * Multiplies parameter to total
	 * @param value integer to be multiplied
	 */
	public void multiply (int value) {
		total *= value;
	}
	
	/**
	 * Divides parameter from total
	 * @param value integer to be divided by
	 */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total /= value;
	}
	
	/**
	 * Creates a string from history of actions. Contents are separated by normal operators
	 * @return String history of actions
	 */
	public String getHistory () {
		return "";
	}
}