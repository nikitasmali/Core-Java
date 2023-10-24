package com.demo.java8;

import java.util.function.Predicate;

public class PredicateInterfaceEx1
{
	public static void main(String[] args)
	{
		//creating predicates
		Predicate<Integer> lesserthan = i-> (i<10);
		//Calling Predicate method
		System.out.println("Result of lesserthan ="+lesserthan.test(4));
		System.out.println("Result of lesserthan ="+lesserthan.test(20));	
		
		Predicate<Integer> greaterthan = i-> (i>10);
		System.out.println("Result of greaterthan ="+greaterthan.test(4));
		System.out.println("Result of greaterthan ="+greaterthan.test(20));	
		
		boolean result = greaterthan.and(lesserthan).test(15);
		System.out.println("Use of and "+result);	
	}
}