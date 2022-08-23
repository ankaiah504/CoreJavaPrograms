package com.app.java.core;

import java.util.stream.Stream;

public class ArrayToStreams {

	public static void main(String[] args) {
		String[] languages = {"Java", "Python", "JavaScript"};
      Stream num=Stream.of(languages);
      num.forEach(System.out::println);
	}

}
