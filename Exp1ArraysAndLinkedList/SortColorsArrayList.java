// 3. Write a java program for getting different colors through ArrayList interface and sort them
// using Collections.sort( ArrayListObj)
package ArrayList;

import java.util.*;
public class SortColorsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println("Before sorting:");
		System.out.println(ls);
		//inbuilt function to sort
		Collections.sort(ls);
		System.out.println("After sorting:");
		System.out.println(ls);
	}

}
