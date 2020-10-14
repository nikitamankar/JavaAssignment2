import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*36. Input a hashmap. Count the keys which are not divisible by 4 and return.*/
public class hashMap36 {
// HashMapJavaMap. Arrays store items in an ordered collection and are accessed using an 
// index number (which is an integer). HashMap stores items as key/value pairs.
	 public static void main(String[] args) {
         HashMap<Integer, String> m1=new HashMap<Integer, String>();
         m1.put(7, "Nikita");
         m1.put(15, "nidhi");
         m1.put(4, "vaishali");
         m1.put(12, "priya");
         int k=0;
         Iterator<Integer> i=m1.keySet().iterator();
          while(i.hasNext()){
               int j=i.next();
               if(j%4!=0)
                     k++;
                }
        System.out.println(m1.keySet());
        System.out.println("The Total number keys arenot divisible by 4:- "+k);
  }

}