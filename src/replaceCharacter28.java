/* 28. String encrption. replace the odd-index character with next character(if it is 'z' 
  replace with 'a'..if 'a' with 'b' as such), 
leave the even index as such. return the encrypted string.   */
public class replaceCharacter28 {
	public static void main(String[] args) {
	      String s="Mangesh";
	      replaceCharacter28 rc=new replaceCharacter28();
	      System.out.println(rc.oddEncryptionOfString(s));
	     // System.out.println(oddEncryptionOfString(s));
	      }
	public  String oddEncryptionOfString(String s) {
	     StringBuffer sb=new StringBuffer();
	      for(int i=0;i<s.length();i++){
	            char c=s.charAt(i);
	            if(i%2!=0){
	                  c=(char)(c+1);
	                  sb.append(c); 
	                  
	      } else {
	                  sb.append(c);
	            }
	      }
	            
	      return sb.toString();
	      
	}
}