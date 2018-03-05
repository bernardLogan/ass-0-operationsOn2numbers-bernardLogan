/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author berna
 *
 */
public class SubtractOperatorFor2Numbers extends OperatorFor2numbers implements Subtract {

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Subtract#subtract(int, int)
	 */
	
	public SubtractOperatorFor2Numbers() {
		//Default constructor
	}
	
	public SubtractOperatorFor2Numbers(float num1, float num2) {
		System.out.println("Parent's number 1: " + super.number1 + "\n" + "Parent's number 2: " + super.number2);
		System.out.println("Number 1: " + num1);
		System.out.println("Number 2: " + num2);
	}
	
	public SubtractOperatorFor2Numbers(float number1, float number2, String msg)
	{
		this(number1, number2);
		float difference = this.subtract(number1, number2);
		System.out.println("Difference is: " + difference + " " + msg);
				
	}
	@Override
	public int subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Subtract#subtract(float, float)
	 */
	@Override
	public float subtract(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Subtract#subtract2numbers()
	 */
	@Override
	public float subtract2numbers() {
		// TODO Auto-generated method stub
		return number1 - number2;
	}

}
