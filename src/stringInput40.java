/*40.  intput="xyzwabcd"
    intput2=2;
    input3=4;
    output=bawz*/
public class stringInput40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="xyzwabcd";
		int n=2, m=4;
		
		StringBuffer sb=new StringBuffer(s1);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		String s2=sb.substring(n, m);
		System.out.println(s2);
		

	}

}
