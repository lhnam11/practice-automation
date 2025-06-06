package DataStructures;

import java.util.HashSet;

public class HashS {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("car1");
		cars.add("car2");
		cars.add("car3");
		cars.add("car4");
		System.out.println(cars);
		if (cars.contains("car1")) // cars.contains kiểm tra có tồn tại trong list
		{
			System.out.println("xe 1 có trong list");
		} else {
			System.out.println("Xe 1 không có trong list");
		}
		cars.remove("car1");
		System.out.println(cars);
		System.out.println("Số lượng xe trong list: " + cars.size());
		for (String i : cars) {
			System.out.println(i);
		}

		HashSet<Integer> numbers = new HashSet<Integer>();

		numbers.add(11);
		numbers.add(5);
		numbers.add(4);

		for (int i = 0; i <= 10; i++) {
			if (numbers.contains(i)) {
				System.out.println(i + " Was found in the set");
			} else {
				System.out.println(i + " was not found in the set");
			}
		}

	}
}
