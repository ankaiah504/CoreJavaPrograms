package com.app.java.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		List cards = Arrays.asList("Visa", "MasterCard", "American Express", "Visa"); System.out.println("list: " + cards);

//		Map<String,String> card=cards
//				.stream()
//				.collect(Collectors.toMap(Function.identity(), String::length,(e1,e2)->e2));
		Map cards2Length = (Map) cards.stream()
				.collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1,HashMap::new));

	}

}
