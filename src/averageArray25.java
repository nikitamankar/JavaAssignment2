import java.util.Arrays;
/* 25. find the average of the maximum and minimum number in an integer array */
public class averageArray25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {5,3,4,1,2};
		
	    Arrays.sort(a);
		int b=a[0];
		System.out.println("Minimum value of Array:  "+b);
		int c=a[a.length-1];
		System.out.println("Maximum value of Array:  "+c);
		int d=(b+c)/2;
		System.out.println("Average of minimum and maximum of Array:  "+d);
		
		

	}

}
