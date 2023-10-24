package com.demo.filedemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 
{
	public static void main(String[] args)
	{
		Pattern pat = Pattern.compile("W+");
		System.out.println(pat);
		Matcher mat = pat.matcher("W WW WWW WSWDWZ");
		while(mat.find())
			System.out.println("Match - "+mat.group());
		String result = mat.replaceAll("TT");
		System.out.println(result);
	}
}
