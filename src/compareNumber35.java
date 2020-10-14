import java.util.Scanner;
//35. Retrieve the elements in a array, which is an input, which are greater than a specific
//input number. Add them and find the reverse of the sum.
public class compareNumber35 {
	public static void main(String[] args) {
		
		int[] m={1,2,3,4,5,6,7,8,9};
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter an Integer:");
	    int n=input.nextInt();
		int sum=0;
		for(int i=0;i<m.length;i++)
			if(m[i]>n)
				sum=sum+m[i];
		System.out.println("Total the numbers greater then n:  "+sum);
				
	     

}
}
