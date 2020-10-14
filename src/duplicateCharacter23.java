/* 23. Write a Program that accepts a string and removes the duplicate characters. */
public class duplicateCharacter23 {
public static int duplicateCharacters(String s1){
		  StringBuffer sb=new StringBuffer(s1);
		  for(int i=0;i<sb.length();i++){
		   int n=0;
		   for(int j=i+1;j<sb.length();j++)
		    if(sb.charAt(i)==sb.charAt(j)){
		     sb.deleteCharAt(j);
		     n++;
		     }
		    if(n>0){
		     sb.deleteCharAt(i);
		     i--;
		     }  
		    }
		  System.out.println(sb);
		  return sb.length();
		 }
		public static void main(String[] args) {
		  String s1="aabcde";
		 System.out.println(duplicateCharacters(s1));
		 }
}