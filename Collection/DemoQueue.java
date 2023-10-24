package collection;

import java.util.PriorityQueue;

public class DemoQueue
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(20);
		pq.add(40);
		pq.add(44);
		pq.add(80);
		pq.add(70);
		System.out.println("Queue="+pq);
		System.out.println("Peek element="+pq.peek());
		System.out.println("After Peek Queue="+pq);
		System.out.println("Poll elements="+pq.poll());
		System.out.println("After poll Queue="+pq);
	}
}