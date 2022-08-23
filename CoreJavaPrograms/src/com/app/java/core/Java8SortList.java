package com.app.java.core;

import java.util.ArrayList;
import java.util.List;

public class Java8SortList {

	public static void main(String[] args) {

		 List<Notes> noteLst = new ArrayList<>();
	        noteLst.add(new Notes(1, "aa", "11"));
	        noteLst.add(new Notes(3, "cc", "33"));
	        noteLst.add(new Notes(4, "bb", "44"));
			noteLst.add(new Notes(2, "dd", "34"));
	        noteLst.add(new Notes(5, "zz", "32"));
	        noteLst.sort((n1,n2)->n2.getId()-n1.getId());   //Desending order
	        noteLst.forEach((note)->System.out.println(note));
	}

}
