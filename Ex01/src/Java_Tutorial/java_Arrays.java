package Java_Tutorial;

public class java_Arrays {
	public static void main(String[] args) {
		String[] cars = { "Volvo", "BMW", "Ford", "Mazada" };
		int[] myNum = { 10, 20, 30, 40 };
		cars[0] = "tada";
		System.out.println(cars[0]);
		System.out.println(cars.length);
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("\n");
		for (String car : cars) {
			System.out.println(car);
		}

		// Real-life Examples
		int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };
		float avg, sum = 0;
		int length = ages.length;

		for (int age : ages) {
			sum += age;
		}

		avg = sum / length;
		System.out.println("The average is: " + avg);
		int lowestAge = ages[0];

		for (int age : ages) {
			if (lowestAge > age) {
				lowestAge = age;
			}
		}
		System.out.println("The lowest age in the array is " + lowestAge);
//		int i = 5;
//		int a = ++i; // i tăng lên 6, rồi gán a = 6
//		int i = 5;
//		int a = i++; // a = 5 (giá trị cũ), rồi i tăng lên 6
		
		// Java Multi-dimensional Arrays ( Mảng đa chiều)
		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
//		myNumbers[1][2] = 9;// nếu đã đặt cụ thể thì nó sẽ chọn cụ thể thay vì chọn từ mảng
//		System.out.println(myNumbers[1][2]); // number1 mảng thứ 2, number 2 phần tử thứ 3 của mảng 2: 0,1,2
		for (int i = 0; i < myNumbers.length; i++) {
			for (int j = 0; j < myNumbers[i].length; j++) // myNumbers[i] là phần tử trong mảng i ví dụ mảng 1 4, mảng 2 3
			{
				System.out.println(myNumbers[i][j]);
			}
		}

	}

}
