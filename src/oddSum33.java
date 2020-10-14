/*33. Retrieve the odd-position digits from input integer array. Multiply them with their 
index and return their sum.*/
public class oddSum33 {

	 public static void main(String[] args) {
         int[] a={1,2,3,4,5,6,7,8,9};
         //       0 1 2 3 4 5 6 7 8
         int[] c=new int[a.length];
         int s=0;
         for(int i=0;i<a.length;i++)
               if(i%2!=0)
            	   c[i]=a[i];
         
        for(int i=0;i<c.length;i++){ 
        	//System.out.println(" "+c[i]); 
  		   System.out.print(" "+c[i]*i);
  		  }
         
        for(int i=0;i<a.length;i++)
            if(i%2!=0)
         s=s+a[i]*i;
    System.out.println();    
  System.out.println("Sum Of Odd Position Elements Multiplied With Their Index Is:"+s);
       
   }
	 
		
		
	

}
