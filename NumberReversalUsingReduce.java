package com.demo;

public class NumberReversalUsingReduce {

	public static void main (String [] args) {
		Integer num=123566;
	Integer reversed=Integer.valueOf(String.valueOf(num).chars().mapToObj(c->String.valueOf((char)c)).reduce((s1,s2)->s2+s1).orElse(""));
	System.out.println(reversed);
	}
}
