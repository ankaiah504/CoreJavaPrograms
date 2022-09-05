package com.app.java.core;

import java.util.Arrays;
import java.util.List;

public class FindMaxValueInList {

	public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max= myList.stream().max(Integer::compare).get();
        System.out.println(max);         

	}

}
