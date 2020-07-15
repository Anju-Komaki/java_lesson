package apply;

import java.util.ArrayList;
import java.util.LinkedList;


public class List {
	public static void main(String[] args) {
		java.util.List<String> list1 = new ArrayList<String>();
		java.util.List<Integer> list2 = new LinkedList<Integer>();

		list1.add("りんご");
		list1.add("みかん");
		list1.add(1, "バナナ");
		System.out.println(list1);

		list1.get(0);

	}

}
