/*Q.38)input:
	Searchstring s1="GeniusRajkumarDev";
	String s2="Raj";
	String s3="Dev";
   output:
        Return 1 if s2 comes before s3 in searchstring else return 2*/
public class searchString38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="GeniusRajkumarDev";
		String s2="Raj";
		String s3="Dev";
		System.out.println(s);
		
		int n1=s.indexOf(s2);
		System.out.println(n1);
		int n2=s.indexOf(s3);
		System.out.println(n2);
		
		if(n1<n2){
			System.out.println(s2+" comes before "+s3);
		}else{
		     System.out.println(s3+" comes before "+s2);
		}
		

	}

}
