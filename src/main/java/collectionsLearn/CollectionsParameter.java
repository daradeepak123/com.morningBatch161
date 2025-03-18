package collectionsLearn;

import java.util.ArrayList;
import java.util.List;

public class CollectionsParameter {
	
	
	
	public static void printListData(List<String> str)
	{
		for(String s:str)
		{
			System.out.println(s);
		}		
	}

	
	public static List<String> insertListData(List<String> str)
	{
		
		for(int i=0;i<100;i++)
		{
			str.add("data"+i);
		}
		
		
		return str;
		
	}

	
	
	public static void main(String[] args) {
		
		
		List<String> str=new ArrayList<String>();
		str=insertListData(str);
		printListData(str);
		

	}

}
