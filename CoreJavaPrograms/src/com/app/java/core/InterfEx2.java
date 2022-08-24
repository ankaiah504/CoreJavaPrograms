package com.app.java.core;

public interface InterfEx2 {

    default void hell(String hello) {
        System.out.println("Do it now"); 
	}
    static void getData(int count) {
    	 System.out.println("Do it now2"); 
    }
}
@FunctionalInterface  
interface InterFEx3 extends InterfEx2{  
    void say(String msg);   // abstract method  
}  