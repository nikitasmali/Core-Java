package com.demo.java8;

@FunctionalInterface 	 //Interface with single abstract method 
//Only one method is possible in interface using this annotaion
interface MyInterface
{
void show();
}

class Demo2 implements MyInterface //Normal way of implementing
{
@Override
public void show()
{
System.out.println("Hello...");	
}
}

public class Demo1
{
public static void main(String[] args)
{
Demo2 d=new Demo2(); 
d.show(); 
}
}