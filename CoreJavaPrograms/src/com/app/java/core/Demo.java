package com.app.java.core;
//a functional interface is extending to a non-functional interface.
//A functional interface can extends another interface only when it does not have any abstract method.


public class Demo implements functionalInterfaceEx1,InterFEx3{
	
	 public void call(String msg){  
	        System.out.println(msg);  
	    }  
	 
	 public static void main(String[] args) {  
		 Demo fie = new Demo();  
	        fie.call("Hello there");
	        fie.hell("Data");
	        InterfEx2.getData(5);
	        fie.say("Response");
	    }

	@Override
	public void say(String msg) {
	    System.out.println("Response");	
		
	}  

}