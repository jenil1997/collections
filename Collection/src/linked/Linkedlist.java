package linked;

import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LinkedList list=new LinkedList();
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			String name=s.next();
			list.add(name);
		}
		String str=s.next();
		System.out.println("size of list is "+list.size());
		System.out.println("list is "+list.isEmpty());
		System.out.println("list is "+list.contains(str));

	}

}
