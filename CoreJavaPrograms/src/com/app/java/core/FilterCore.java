package com.app.java.core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCore {

	public static void main(String[] args) {
	
		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
	    System.out.println("original list: " + numbers);
	    List<Integer> even=numbers.stream()
	    		.map(s->Integer.valueOf(s))
	    		.filter(i->i%2==0).collect(Collectors.toList());
	    System.out.println("processed list, only even numbers: " + even);

	}

}
