package eg1;

public class Demo1 {
	
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		String s3 = new String("hello");
		System.out.println(System.identityHashCode(s3));
		
		s3=s3.intern();
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(s3.equals("hey"));
		System.out.println(s3.equals("Hello"));
		System.out.println(s3.equals(s1));
		
		System.out.println(s1.equalsIgnoreCase("HeLlo"));
		
		System.out.println(s1.endsWith(".com"));
		System.out.println(s1.startsWith("he"));
		
		System.out.println(s1.contains("el"));
		System.out.println(s1.contains("le"));
		
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(0));
		
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		
		char c[]=s1.toCharArray();
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(1, 3));
		
		String s4 = "       Vivek       ";
		System.out.println(s4);
		s4=s4.trim();
		System.out.println(s4);
		
		//all words capital
		String s5="Hello hi good evening, Ready to skip or jump off";
		String s6[]=s5.split(" ");
		for (int i = 0; i < s6.length; i++) {
			System.out.print(s6[i].toUpperCase()+" ");
		}
		
		//first letter capital letter of each word
		System.out.println("\n");
		for(int j=0; j<s6.length; j++) {
			String s7 = s6[j].substring(0,1).toUpperCase()+s6[j].substring(1, s6[j].length());
			System.out.print(s7);
			if(j<s6.length-1) {
				System.out.print(" ");
			}
		}
		System.out.println("\n");
		
		s5=s5.replace(" ", "-");
		System.out.println(s5);
		
	}

}
