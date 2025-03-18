package collectionsLearn;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetLearn {

	public static void main(String[] args) {
		
		
		Set<String> str=new HashSet<String>();
		
		
		str.add("hello");
		str.add("apple");
		str.add("orange");
		str.add("hello");
		str.add("apple");
		str.add("orange");
		str.add("hello");
		str.add("1apple");
		str.add("orange");
		
		
		for(String s:str)
		{
			System.out.println(s);
		}

	}

}
