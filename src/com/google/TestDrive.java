package com.google;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestDrive {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Johny", "Rocky", "Tim", "Alex", "Johny");
		Map<String, Long> mapOfNames = names.stream()
											.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		mapOfNames.entrySet().stream()
							.forEach(e -> System.out.println(e.getKey()+"_"+e.getValue()));
	}

}
