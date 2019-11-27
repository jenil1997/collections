package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Set {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		HashSet set=new HashSet();
		
		set.add("messi");
		set.add("xavi");
		set.add("pyuol");
		set.add("iniesta");
		set.add("pyuol");
		set.add("xavi");
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
