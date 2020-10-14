import java.util.Scanner;
/*Q.27. find the three consecutive characters in a string. if the string consists any 
  three consecutive characters return 1 else return -1
   like AAAxyzaaa will return true.   */
public class consecutiveCharacters27 {
	public static void main(String[] args) {
	      //String s1="AAAxyzaaa";
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a String");
	      String s1 = sc.nextLine();
	      System.out.println(consecutiveCharactersCheck(s1));
	      boolean b=consecutiveCharactersCheck(s1);
	      if(b==true)
	            System.out.println("presence of consecutive characters");
	      else
	            System.out.println("absence of consecutive characters");
	      }
public static boolean consecutiveCharactersCheck(String s1) {
	      boolean b=false;
	      int c=0;
	      for(int i=0;i<s1.length()-1;i++)
	            if((s1.charAt(i)==s1.charAt(i+1)))
	                        c++;
	      if(c>=2)
	            b=true;
	      return b;
	}
}