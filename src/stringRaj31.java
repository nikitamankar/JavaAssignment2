/*31. input1="Rajasthan";
input2=2;
input3=5;
output=hts;*/
public class stringRaj31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="Rajasthan";
		int input2=2,input3=5;
		/*for(int i=input1.length()-1;i>=0;i--){
			char s1=input1.charAt(i);
			System.out.print(s1);
		}*/
		
		StringBuffer sb=new StringBuffer(input1);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		String s1=sb.substring(input2, input3);
		//String s1=sb.substring(2, 5);
		System.out.println(s1);
		
		
	}
			
		
	}


