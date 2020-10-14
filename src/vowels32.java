/*Q.32input1=commitment;
 *           0123456789         i
 *           12345678910
  output=cmmitmnt;
c be the first index position 
remove even vowels from the string*/

public class vowels32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	            String s1="commitment";
	           StringBuffer sb1=new StringBuffer();
for(int i=0;i<s1.length();i++)
	       if((i%2)==0)
	       sb1.append(s1.charAt(i));
	       else if((i%2)!=0)
	         if(s1.charAt(i)!='a' && s1.charAt(i)!='e' && s1.charAt(i)!='i' 
	         && s1.charAt(i)!='o' && s1.charAt(i)!='u')
	         //if(s1.charAt(i)!='A' && s1.charAt(i)!='E' && s1.charAt(i)!='I' 
	        // && s1.charAt(i)!='O' && s1.charAt(i)!='U')
	      sb1.append(s1.charAt(i));
System.out.println(sb1);
	            
	           
	           
	      
	}

}

