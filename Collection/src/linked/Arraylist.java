package linked;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("hai");
		list.add("welcome");
		list.add("face");
		ArrayList list1=new ArrayList();
		list1.add("java");
		list.addAll(list1);
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}
}