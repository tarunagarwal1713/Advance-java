// 2. Write a java program for getting different colors through ArrayList interface and remove the
// 2nd element and color "Blue" from the ArrayList (using remove by index and remove by
// object)

import java.util.*;
public class RemoveColorArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Black");
		ls.add("Saffron");
		ls.add("Brown");
		ls.add("Yellow");
		ls.add("Violet");
		System.out.println(ls);
		//to remove the element at index 2
		ls.remove(3);
		System.out.println(ls);
		//to remove an element blue
		ls.remove("Blue");
		System.out.println(ls);
	}

}
