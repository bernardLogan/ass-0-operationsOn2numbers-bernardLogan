/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author berna
 *
 */
public class AddOperatorFor2Numbers extends OperatorFor2numbers implements Add {

	public AddOperatorFor2Numbers() {
		// Parent constructor not called, so java will call parent's constructor automagically
	}
	
	public AddOperatorFor2Numbers(float num1, float num2)
	{
		
		System.out.println("Parent's number 1: " + super.number1 + "\n" + "Parent's number 2: " + super.number2);
		System.out.println("Number 1: " + num1);
		System.out.println("Number 2: " + num2);
	}
	
	public AddOperatorFor2Numbers(float number1, float number2, String msg)
	{
		this(number1, number2);
		float sum = this.add(number1, number2);
		System.out.println("Sum is: " + sum + " " + msg);
				
	}
	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Add#add(int, int)
	 */
	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
		
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Add#add(float, float)
	 */
	@Override
	public float add(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Add#add2numbers()
	 */
	@Override
	public float add2numbers() {
		// TODO Auto-generated method stub
		return number1 + number2;
	}

}
