
import java.util.ArrayList;

public class BasicList {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			int numElement = (int) (Math.random() * 100 + 10);
			if (numElement > 100) {
				numElement -= 10;
			}
			myList.add(numElement);
		}
		System.out.println(myList);
		System.out.println("Size of the list is " + myList.size());
		int midIndex = (myList.size() + 1) / 2;
		myList.add(midIndex, 200);
		System.out.println(myList);
		System.out.println("Size of the list is " + myList.size());
		System.out.println("Value 200 is located at index " + midIndex);
	}

}
