package com.demo.myapp;

import java.util.Comparator;

public class SortStudByRollNo implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2)
	{
		if(s1.getRollno()>s2.getRollno())
			return 1;
		else if(s1.getRollno()<s2.getRollno())
			return -1;
		else
		return 0;
	}
}
