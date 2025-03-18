package arraysLearn;

public class ArraysWithBulk {

	public static void main(String[] args) {
		
		
		int a[]=new int[100];


		int count=1;
		for(int i=0;i<a.length;i++)
		{
			a[i]=count++;
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
		
		
		for(int aa:a)
		{
			System.out.println(aa);
		}
		
		

	}

}
