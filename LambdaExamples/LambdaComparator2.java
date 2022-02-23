
import java.util.*;

public class LambdaComparator2{
    public static void main(String[] args) {
        TreeSet<Prod> ts=new TreeSet<Prod>(
        		(p1,p2)->{
        			return (int)(p1.price - p2.price);
        		}
        		);

        //Adding Products to List
        ts.add(new Prod("HP Laptop",25000f));
        ts.add(new Prod("Keyboard",300f));
        ts.add(new Prod("Monitor",3500f));

        System.out.println("Sorting based on price...");
        
        for(Prod p:ts){
            System.out.println(p.name+" "+p.price);
        }

    }
}  