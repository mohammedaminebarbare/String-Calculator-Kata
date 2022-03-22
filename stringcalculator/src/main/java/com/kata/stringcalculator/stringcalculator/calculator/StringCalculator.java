package com.kata.stringcalculator.stringcalculator.calculator;

import java.util.List;
import java.util.stream.Stream;

import org.apache.logging.log4j.util.Strings;
import org.springframework.util.CollectionUtils;

public class StringCalculator {
	public static int Add(String numbers) throws Exception {
		String delimiter =",";
		String calculableNumbers = numbers;
		
		if (Strings.isBlank(numbers))
			return 0;
		if (numbers.startsWith("//")){
			delimiter = numbers.substring(2, 3);
			calculableNumbers = numbers.substring(numbers.indexOf("\n"));
		}
		if(calculableNumbers.contains("-") ) {
			List<String> negatives = Stream.of(calculableNumbers.trim().split(delimiter + "|\n")).filter(x -> x.startsWith("-")).toList();
			if(!CollectionUtils.isEmpty(negatives))
				throw new Exception("negatives not allowed" + negatives);
		}
		if (calculableNumbers.contains(delimiter) || calculableNumbers.contains("\n"))
			return Stream.of(calculableNumbers.trim().split(delimiter + "|\n")).map(x -> Integer.parseInt(x)).reduce((a, b) -> a + b).get();
		
		return Integer.parseInt(calculableNumbers);
	}
}
