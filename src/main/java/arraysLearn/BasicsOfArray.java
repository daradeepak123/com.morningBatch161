package arraysLearn;

public class BasicsOfArray {

	public static void main(String[] args) {
	
	
		
		int a[]=new int[5];
		
		a[0]=10;
		a[1]=50;
		a[2]=33;
		a[3]=a[0]+a[1];
		a[4]=60;
		
		
//		System.out.println(a[0]+a[0]);
//		System.out.println(a[3]);
		
		
//		for(int i=1;i<4;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		
		for(int abc:a)
		{
			System.out.println(abc);
			
		}
		
		

	}

}
