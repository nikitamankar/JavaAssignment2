import java.util.Scanner;
/* 24. validate a password 
i) there should be atleast one digit
ii) there should be atleast one of '#','@' or '$' .
iii)the password should be of 6 to 20 characters
iv) there should be more uppercase letter than lower case.
v) should start with an upper case and end with lower case
*/
public class validatePassword24 {
	 public static void main(String[] args) {
		 //Scanner s=new Scanner(System.in);
			//String st=s.next();
		 String st="PaSS@mmN";
		 boolean b=validatingPassword(st);
			if(b==true)
				System.out.println("valid password");
			else
				System.out.println("Invalid Password");
		}

	public static boolean validatingPassword(String st) {
		boolean b1=false,b2=false;
		if(Character.isUpperCase(st.charAt(0)))
			if(Character.isLowerCase(st.charAt(st.length()-1)))
				if(st.length()>=6 && st.length()<=20)
					for (int i = 0; i < st.length();i++)   
			    	{   char c = st.charAt(i);
			    	
			    	    if(Character.isDigit(c)){   
			    	      b1=true;  
			    	      
			    	    }    
			    	}
		if(b1==true)
			
				for (int i = 0; i < st.length();i++)   
		    	{   char c = st.charAt(i);   
		    	    if(c=='#' || c=='@' || c=='$'){   
		    	      b2=true; 
		    	      
		    	      }    
		    	    }
		return b2;
	}
			    	
			    	}