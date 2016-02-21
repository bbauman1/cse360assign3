package cse360assign3;
/**
 * Calculator class that can perform the 4 basic math operations. History of operations
 * is recorded.
 * @author Brett Bauman
 * @version Feb, 20, 2016
 * PIN: 117
 *
 */
public class Calculator {

	private int total;
	private String history;
	
	/**
	 * Creates an integer total
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0"; // include default history of 0
	}
	
	/**
	 * Get the total value
	 * @return	Value of total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds parameter to total and updates history
	 * @param value integer to be added
	 */
	public void add (int value) {
		total += value;		
		setHistory("+", value);
	}
	
	/**
	 * Subtracts parameter from total and updates history
	 * @param value integer to be subtracted
	 */
	public void subtract (int value) {
		total -= value;
		setHistory("-", value);
	}
	
	/**
	 * Multiplies parameter to total and updates history
	 * @param value integer to be multiplied
	 */
	public void multiply (int value) {
		total *= value;
		setHistory("*", value);
	}
	
	/**
	 * Divides parameter from total and updates history. 
	 * Sets total to 0 if parameter is 0
	 * @param value integer to be divided by
	 */
	public void divide (int value) {
		if(value == 0) {
			total = 0;
			setHistory("/", 0);
		}
		else {
			total /= value;
			setHistory("/", value);
		}
		
	}
	
	/**
	 * Creates a string from history of actions. Contents are separated by normal operators
	 * @return String history of actions
	 */
	public String getHistory () {
		return history;
	}
	
	/**
	 * Append the operation called from to the history string
	 * @param operator	operation sign from method called
	 * @param value		value to be appended to history
	 */
	private void setHistory(String operator, int value) {
		history += " " + operator + " " + value;
	}
}