package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class DataStructure {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		// LinkedList<String>cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);

		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// Add key and values ( Country, City )
		capitalCities.put("England", "Lodon");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("VietNam", "HaNoi");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
		// HashSet tập hợp các phần tử không trùng lặp
		HashSet<String> carsOther = new HashSet<String>();
		carsOther.add("Honda");
		carsOther.add("wave");
		carsOther.add("Dream");
		carsOther.add("SH");
		carsOther.add("50");
		carsOther.add("50");// khi chạy thì nó giảm xuống 1 phần tử nhưng không báo error
		System.out.println(carsOther);

		// Iterator được sử dụng để duyêt qua các phần tử trong một cấu trúc như
		// Arraylist, HashSet,LinkedList
		// Get an iteraotr for the Arraylist
		Iterator<String> it = cars.iterator();

		// Iterate Through the list using the iterator
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
