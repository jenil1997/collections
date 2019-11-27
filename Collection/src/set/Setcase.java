package set;

import java.util.Scanner;

public class Setcase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Set<card> h=new Set();
		System.out.println("enter the number");
		int n=s.nextInt();
		String symbl;
		int num;
		int count=0;
		Card c=new NewCard[50];
		while(h.size()<n)
		{
			System.out.println("enter the symbol");
			symbl=s.next();
			num=s.nextInt();
			c[count]=new NewCard();
			c[count].setSymbl(symbl);
			c[count].setNum(num);
			count++;
		}
		

	}

}
