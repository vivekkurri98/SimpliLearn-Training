package eg;

public class TitleCase {

	public static void main(String[] args) {
		String s = "hello hey how are you";
		String ar[] = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<ar.length; i++) {
			sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
		}
		System.out.println(sb.toString().trim());
		
		StringBuffer sb1 = new StringBuffer(s);
		sb1.reverse();
		String s1 = new String(sb1);
		String arr[] = s1.split(" ");
		
		StringBuilder sb2 = new StringBuilder();
		
		for(int j=0; j<arr.length; j++) {
			sb2.append(Character.toUpperCase(arr[j].charAt(0))).append(arr[j].substring(1)).append(" ");
		}
		System.out.println(sb2.reverse().toString().trim());
	}

}
