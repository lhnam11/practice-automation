package DataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class ListArray {
	public static void main(String[] args) {
//		ArrayList<String> cars = new ArrayList<>();
//		cars.add("user1");
//		cars.add("user2");
//		cars.add("user3");
//		cars.add(0, "user5");
//
////		System.out.println(cars);
//		System.out.println(cars.get(2));
//		System.out.println("\n");
//		cars.remove(0);
//		System.out.println(cars);
//		cars.set(0, "tada");
//		System.out.println(cars);
//		cars.clear();
//		System.out.println(cars);
//	
//		System.out.println("Số lượng phần tử trong danh sách là: " + cars.size()); // số lượng phần tử trong danh sách 
		// for
//		for (int i = 0 ; i < cars.size() ; i++)
//		{
//			System.out.println(cars.get(i));
//		}
		// for each
//		for (String i : cars) {
//			System.out.println(i);
//		}
		ArrayList<Integer> myNumbers = new ArrayList<>();
		myNumbers.add(10);
		myNumbers.add(20);
		myNumbers.add(25);
		myNumbers.add(15);
		Collections.sort(myNumbers, Collections.reverseOrder()); // giảm dần
		for (int i : myNumbers) {
			System.out.println(i);
		}
		// Sort an Arraylist
		ArrayList<String> persons = new ArrayList<>();
		persons.add("person1");
		persons.add("sperson2");
		persons.add("fperson3");
		persons.add("cperson4");
		persons.add("aperson5");
		persons.add("dperson6");
		Collections.sort(persons); // tăng dần
		for (String i : persons) {
			System.out.println(i);
		}

	}
}
