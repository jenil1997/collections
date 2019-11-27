package linked;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlistcase1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedList list = new LinkedList();
		String name, add, num, mail, ptype, pid,opt;
		int id;
		System.out.println("enter the no of customers");
		int n = s.nextInt();
		Customer1 c1[] = new Customer1[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter name");
			name = s.next();
			System.out.println("eneter address");
			add = s.next();
			System.out.println("enter contact number");
			num = s.next();
			System.out.println("enter email");
			mail = s.next();
			c1[i] = new Customer1();//memory allocation
			System.out.println("Do you want to update mail id");
			opt=s.next();
			opt=opt.toUpperCase();//covert to uppercase
			if(opt.equals("YES"))
			{
				System.out.println("enter the new email");
				mail=s.next();//new mail id is read
			}
			
			c1[i].setName(name);
			c1[i].setAdd(add);
			c1[i].setNum(num);
			c1[i].setMail(mail);
			list.add(c1[i]);//all the values in ith position is stored in list

		}
		Iterator<Customer1> itr = list.iterator();//iteration object is created
		int i = 0;
		while (itr.hasNext()) {
			Customer1 c2 = itr.next();
			System.out.println("employ details " + i);
			System.out.println("*************************");
			System.out.println("name :" + c2.getName());
			System.out.println("Address :" + c2.getAdd());
			System.out.println("Contact number :" + c2.getNum());
			System.out.println("Mail id :" + c2.getMail());
			i++;

		}
		System.out.println("do you want to delete the customer details");
		System.out.println("enter the id");
		id=s.nextInt();
		list.remove(c1[id]);
		Iterator<Customer1> itr1 = list.iterator();//new object is created
		while(itr1.hasNext())
		{
			Customer1 c2 = itr1.next();
			System.out.println("employ details " + i);
			System.out.println("*************************");
			System.out.println("name :" + c2.getName());
			System.out.println("Address :" + c2.getAdd());
			System.out.println("Contact number :" + c2.getNum());
			System.out.println("Mail id :" + c2.getMail());
			
		}

	}

}
