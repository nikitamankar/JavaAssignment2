import java.util.StringTokenizer;

/*Q.30. GIVEN A STRING 555-666-1234
DISPLAY AS 55-56-661-234    */
public class stringDisplay30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="555-666-1234";
	System.out.println(s);
	 StringTokenizer t=new StringTokenizer(s,"-");
	 String s1=t.nextToken();
	 System.out.println(s1);
	 String s2=t.nextToken();
	 System.out.println(s2);
	 String s3=t.nextToken();
	 System.out.println(s3);
	 
	 StringBuffer sb= new StringBuffer();
	 System.out.println(sb.append(s1.substring(0, s1.length()-1)).append('-'));//55-
	 System.out.println(sb.append(s1.charAt(s1.length()-1)).append(s2.charAt(0)).append('-'));//56-
	 System.out.println(sb.append(s2.substring(1, s2.length())).append(s3.charAt(0)).append('-'));//661-
	 System.out.println(sb.append(s3.substring(1, s3.length())));//234
	 
	}
	

}
