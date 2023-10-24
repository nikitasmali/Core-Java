package com.demo.filedemo;

import java.util.StringTokenizer;

public class TokenizerDemo 
{
	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer("Mumbai Pune Chennai");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
