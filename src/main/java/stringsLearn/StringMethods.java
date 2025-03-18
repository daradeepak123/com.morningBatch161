package stringsLearn;

public class StringMethods {

	public static void main(String[] args) {
		
		String s="hellho! 234h";
		String name="gur ivi Reddy ";
		String ss="ello!2";
		
		System.out.println(s);
		
		char c=s.charAt(0);
		System.out.println(c);
		
		System.out.println(s.charAt(0));
		
		System.out.println(s.codePointAt(0));
		System.out.println(s.codePointBefore(3));
		System.out.println(s.compareTo(ss));
		System.out.println(s.concat(ss).contains("!"));
		System.out.println(s.indent(1).concat(ss));
		System.out.println(s.contains(ss));
//		String s1=s.concat(ss);
//		System.out.println(s1.contains("!"));
		
		System.out.println(s.contentEquals("hello!234"));
		System.out.println(s.endsWith("hello!234"));
		System.out.println(s.equals("heLlo!234"));
		System.out.println(s.equalsIgnoreCase("HeLLo!234"));
		System.out.println(s.indent(2));
		
		System.out.println(s.concat(ss).indent(1));
		
		System.out.println(s.indexOf('h'));
		System.out.println(s.indexOf(c));
		System.out.println(s.indexOf("ell"));
		System.out.println(s.indexOf('h', 3, 8));
		System.out.println(s.intern());
		System.out.println(s.isBlank());
		System.out.println(s.lastIndexOf('h'));
		System.out.println(s.length());
		System.out.println(s.repeat(2));
		System.out.println(s.replace('h', 'H'));
		System.out.println(s.replaceFirst("h", "H"));
		System.out.println(name.replace(" ",""));
		System.out.println(s.substring(4, 8));
		
		String sentance="mom and dad are going to meet madam";
		String sss[]=sentance.split(" ");
		
		for(String abc:sss)
		{
			System.out.println(abc);
			
		}
		
		char ch[]=s.toCharArray();
		
		
		
		
	}

}
