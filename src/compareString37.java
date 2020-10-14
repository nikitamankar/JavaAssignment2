/*(37). compare two strings, if the characters in string 1 are present in
   string 2, then it should be put as such in output, else '+' should be
   put in output...ignore case difference.
    input 1:"New York"
	input 2:"NWYR"
    output:N+w+Y+r+    */

public class compareString37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="New York";
		String s2="NWYR";
  
		StringBuffer sb=new StringBuffer();
		String s3=s1.toUpperCase();
		for(int i=0;i<s2.length();i++)
			for(int j=0;j<s3.length();j++)
				if(s2.charAt(i)==s3.charAt(j))
					sb.append(s1.charAt(j)).append('+');
		System.out.println(sb);
	}
}
