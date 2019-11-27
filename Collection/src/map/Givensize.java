package map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Givensize {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList list=new ArrayList();
		int n=s.nextInt();
		String st;
		for(int i=0;i<n;i++)
		{
			st=s.next();
			list.add(st);
		}
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}

	}

}
