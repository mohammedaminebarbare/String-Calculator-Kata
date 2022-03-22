package com.kata.stringcalculator.stringcalculator.calculator;

import java.util.stream.Stream;

import org.apache.logging.log4j.util.Strings;

public class StringCalculator {
	public static int Add(String numbers) {
		if (Strings.isBlank(numbers))
			return 0;
		if (numbers.contains(",") || numbers.contains("\n"))
			return Stream.of(numbers.split(",|\n")).map(x -> Integer.parseInt(x)).reduce((a, b) -> a + b).get();
		
		return Integer.parseInt(numbers);
	}
}
