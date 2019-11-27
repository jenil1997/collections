package map;

import java.util.ArrayList;
import java.util.Iterator;

public class Clear {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();//object creation
		list.add("hai");//adding values to list
		list.add("welcome");
		list.add("face");
		ArrayList list1=new ArrayList();
		list1.add("java");
		list.addAll(list1);
		list.clear();//delete all elements
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}

	}

}
