import java.util.ArrayList;
import java.util.List;
/*29. Retrieve the max from array which is in a odd-index*/
public class maxArray29 {
public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={11,22,33,44,55,21};
	          //  0  1  2  3  4  5
		int[] c=new int[a.length];
		
		for(int i=0;i<a.length;i++)
			if(i%2!=0){
				c[i]=a[i];
			System.out.println(" "+c[i]);
			}
		for(int i=0;i<c.length;i++)
			for(int j=i+1;i<c.length;i++)
				if(c[i]>c[j])
				{
					int k=c[i];
					System.out.println("Highest Number is:  "+k);
				}
   }	
}
