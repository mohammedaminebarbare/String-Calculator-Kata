package com.kata.stringcalculator.stringcalculator;

import com.kata.stringcalculator.stringcalculator.calculator.StringCalculator;

public class StringcalculatorApplication {

	public static void main(String[] args) {
		
		System.out.println("example 0 " + StringCalculator.Add(null));
		System.out.println("example 1 " + StringCalculator.Add(""));
		System.out.println("example 2 " + StringCalculator.Add("1"));
		System.out.println("example 3 " + StringCalculator.Add("1,2"));
		System.out.println("example 3 " + StringCalculator.Add("1,2,3"));
	}

}
