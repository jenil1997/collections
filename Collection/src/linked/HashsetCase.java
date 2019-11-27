package linked;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class HashsetCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		HashSet set=new HashSet();
		Customer23 z[]=new Customer23[50];
		Customer23 z1=new Customer23();
		int choice;
		do
		{
			System.out.println("1)Book\n2)Check status\n3)Exit");
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Booking");
				System.out.println("choose service requird");
				System.out.println("Ac or non-Ac(ac/nac)");
				z1.setAc(s.next());
				System.out.println("cot(s/d");
				z1.setCot(s.next());
				System.out.println("with cable connection or without cble connection(c/nc");
				z1.setCable(s.next());
				System.out.println("wifi or not(w/nw");
				z1.setWifi(s.next());
				System.out.println("Laundary service needed or not(l/nl)");
				z1.setLaun(s.next());
				set.add(z1.getAc());
				set.add(z1.getCot());
				set.add(z1.getCable());
				set.add(z1.getWifi());
				set.add(z1.getLaun());
				
			}
			case 2:
			{
				System.out.println("enter the room number");
				
			break;	
			}
			case 3:
			{
				
				
			}
			}
			
		}while(choice!=3);

	}

}
