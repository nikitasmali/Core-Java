package com.demo.filedemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo 
{
	public static void main(String[] args) 
	{
		String INPUT = "foo foo foooo finfoo Foo";
		Pattern p = Pattern.compile("foo");
		Matcher m = p.matcher("INPUT");
		System.out.println("Current INPUT is:"+INPUT);
		System.out.println("lookingAt():"+m.lookingAt());
		System.out.println("matches():"+m.matches());
	}
}
