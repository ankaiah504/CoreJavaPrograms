package com.app.java.logic;

public class ReversString {

	public static void main(String[] args) {
		String str="abcde";
		String result ="";
		
			char ch;
			for(int i=0;i<str.length();i++) {
				ch=str.charAt(i);
				result=ch+result;
				
			}
		
		      System.out.println("Reversed word: "+ result);

	}

}
