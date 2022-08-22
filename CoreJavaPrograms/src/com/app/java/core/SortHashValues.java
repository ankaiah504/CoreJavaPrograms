package com.app.java.core;
import java.util.Collections; 
import java.util.Comparator; 
import java.util.HashMap; 
import java.util.LinkedHashMap;
import java.util.Map; 
import static java.util.stream.Collectors.*; 
import static java.util.Map.Entry.*;

public class SortHashValues {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Ankaiah");
		map.put(2,"RiyaSree");
		map.put(3,"Bhumi");
		map.put(4,"Shivani");
		System.out.println("Before Sorting"+map);
		HashMap<Integer,String> m=map
				.entrySet()
				.stream()
				.sorted(comparingByValue())
				.collect(toMap(e->e.getKey(),e->e.getValue(),(e1,e2)->e2,LinkedHashMap::new));

		System.out.println("Result after Sorting"+m);
		
		HashMap<Integer,String> m1= m .entrySet()
				.stream() 
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())) 
				.collect( toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println("map after sorting by values in descending order: " + m1); }

	}


//Steps to Sort a HashMap by Values in Java 8
/***1. Get the set of entries by calling the Map.entrySet() method.

2. Get the stream of entries by calling stream() method.

3. Call the sorted method with a Comparator.
4. Use the Map.Entry.comparingByValue() comparator to sort entries by values.

5. Collect the result using the collect() method.
6. Use Collectors.toMap() method to get the result in another Map. 

7. Provide LinkedHashMap::new to the last parameter to force it to return a LinkedHashMap, to keep the sorted order preserved.

8. In order to sort in decreasing order, just reverse the order of Comparator using Collections.reverseOrder() or Comparator.reverse() method of Java 8.  

This is the new method added into the Comparator class in Java SE 8. You can further see The Complete Java MasterClass for the full list of new methods added into key Java classes like Java Collection Framework, String, and Comparator, etc


Read more: https://javarevisited.blogspot.com/2017/09/java-8-sorting-hashmap-by-values-in.html#ixzz7ci8hMGVx
 * 
 * 
 * 
 */
