package linked;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class hashmap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String name;
		int age;
		HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
		Employee[] emp = new Employee[n];
		for (int i = 0; i < n; i++) {
			name = s.next();
			age = s.nextInt();
			emp[i] = new Employee();
			emp[i].setName(name);
			emp[i].setAge(age);
			map.put(i, emp[i]);
		}
		for (Entry<Integer, Employee> ei : map.entrySet()) {
			int key = ei.getKey();
			Employee e = ei.getValue();
			System.out.println(key + e.getName() + e.getAge());

		}

	}

}

class Employee {
	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
