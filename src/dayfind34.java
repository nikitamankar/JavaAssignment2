import java.util.StringTokenizer;

//34. Return the number of days in a month, where month and year are given as input.
public class dayfind34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="02/2014";
		StringTokenizer st=new StringTokenizer(s,"/");
		int n1=Integer.parseInt(st.nextToken());
		System.out.println(n1);
		String s1=st.nextToken();
		System.out.println(s1);
		int n2=Integer.parseInt(s1);
		System.out.println(n2);
		int n3=s1.length();
		System.out.println(n3);
		
		if(n3==4)
		{
		if((n1==1)||(n1==3)||(n1==5)||(n1==7)||(n1==8)||(n1==10)||(n1==12))
			System.out.println("31");
		else
			if((n1==4)||(n1==6)||(n1==9)||(n1==11))
				System.out.println("30");
			else 
				if(n1==2)
				if(n2%4==0)
					System.out.println("29");	
				else
					System.out.println("28");
					
}
		

}

}
