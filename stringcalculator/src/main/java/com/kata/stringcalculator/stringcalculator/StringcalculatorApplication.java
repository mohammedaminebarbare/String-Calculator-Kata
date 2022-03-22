package com.kata.stringcalculator.stringcalculator;

import com.kata.stringcalculator.stringcalculator.calculator.StringCalculator;

public class StringcalculatorApplication {

	public static void main(String[] args) throws Exception {
		
		System.out.println("example 0 " + StringCalculator.Add(null));
		System.out.println("example 1 " + StringCalculator.Add(""));
		System.out.println("example 2 " + StringCalculator.Add("1"));
		System.out.println("example 3 " + StringCalculator.Add("1,2"));
		System.out.println("example 3 " + StringCalculator.Add("1,2,3"));
		System.out.println("example 4 " + StringCalculator.Add("1\n2,3"));
		System.out.println("example 5 " + StringCalculator.Add("//f\n1f2"));
		System.out.println("example 6 " + StringCalculator.Add("-1,-2,3"));
	}

}
