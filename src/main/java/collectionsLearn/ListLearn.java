package collectionsLearn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListLearn {

	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<Integer>();
		
		
		list.add(500);
		list.add(5000);
		list.add(200);
		list.add(500);
		list.add(5000);
		list.add(200);
		
		
		for(int i:list)
		{
			System.out.println(i);
		}
		
		
		List<String> list1=new LinkedList<String>();
		
		
		list1.add("500");
		list1.add("5000");
		list1.add("200");
		list1.add("500");
		list1.add("5000");
		list1.add("200");
		
		
		for(int i:list)
		{
			System.out.println(i);
		}
		
		
		List<String> lst=new Vector<String>(list1);
		
		
		
		System.out.println("lst data "+lst.get(0));
		
		

	}

}
