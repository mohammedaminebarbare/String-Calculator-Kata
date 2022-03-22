package com.kata.stringcalculator.stringcalculator.calculator;

import java.util.stream.Stream;

import org.apache.logging.log4j.util.Strings;

public class StringCalculator {
	public static int Add(String numbers) {
		String delimiter =",";
		String calculatableNumbers = numbers;
		if (Strings.isBlank(numbers))
			return 0;
		if (numbers.startsWith("//")){
			delimiter = numbers.substring(2, 3);
			calculatableNumbers = numbers.substring(numbers.indexOf("\n"));
		}
		if (calculatableNumbers.contains(delimiter) || calculatableNumbers.contains("\n"))
			return Stream.of(calculatableNumbers.trim().split(delimiter + "|\n")).map(x -> Integer.parseInt(x)).reduce((a, b) -> a + b).get();
		return Integer.parseInt(calculatableNumbers);
	}
}
