package DataStructures;

import java.util.HashMap;

public class HashM {
	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		capitalCities.put("VietNam", "HaNoi");
		capitalCities.put("Gernamy", "Berlin");
		capitalCities.put("USA", "WashingtonDC");
		System.out.println(capitalCities);
		System.out.println(capitalCities.get("VietNam"));
		capitalCities.remove("VietNam");
		System.out.println(capitalCities);
		System.out.println("Danh sách phần tử: " + capitalCities.size());
//		capitalCities.clear();
//		System.out.println("Danh sách sau khi clear:" + capitalCities);
		// Duyệt Key
		for (String key : capitalCities.keySet()) {
			System.out.println("Key: " + key);
		}
		// Duyệt value
		for (String value : capitalCities.values()) {
			System.out.println("Value: " + value);
		}
		// Duyệt cả value và key
		for (String key : capitalCities.keySet()) {
			System.out.println("key: " + key + " | Value: " + capitalCities.get(key)); // get "key" nào sẽ lấy giá trị
																						// value của key đó
		}
		// ví dụ cho trường hợp số chữ

		HashMap<String, Integer> people = new HashMap<String, Integer>();

		people.put("Nam", 17);
		people.put("Nghĩa", 18);
		people.put("Dương", 20);
		System.out.println(people);

	}

}
