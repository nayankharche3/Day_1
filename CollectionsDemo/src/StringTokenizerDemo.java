import java.util.StringTokenizer;  

public class StringTokenizerDemo{  
 public static void main(String args[]){  
	 
   StringTokenizer st = new StringTokenizer(
		   "This;institute;name;is;some;institute",";");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken()); 
     }  
   }  
}