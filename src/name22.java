import java.util.StringTokenizer;
/* 22. Enter yout name and return a string "print the title first and then comma and then 
 * first letter of initial name.
 */
public class name22 {
	 
		 public static void main(String[] args) {
		  String s1="Mankar Nikita";
		  StringTokenizer t=new StringTokenizer(s1," ");
		  String s2=t.nextToken();
		  String s3=t.nextToken();
		  
		  StringBuffer sb=new StringBuffer(s2);
		  sb.append(',').append(s3.charAt(0));
		  System.out.println(sb);
		 }
}
