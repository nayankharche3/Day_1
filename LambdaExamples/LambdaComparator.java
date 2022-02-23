import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Prod {
    String name;
    float price;
    public Prod(String name, float price) {
        this.name = name;
        this.price = price;
    }
}

public class LambdaComparator{
    public static void main(String[] args) {
        List<Prod> list=new ArrayList<Prod>();

        //Adding Products to List
        list.add(new Prod("HP Laptop",25000f));
        list.add(new Prod("Keyboard",300f));
        list.add(new Prod("Monitor",3500f));

        System.out.println("Sorting based on price...");

        // implementing lambda expression  
        /*Collections.sort(list,(p1,p2)->{
            return p1.name.compareTo(p2.name);
        });*/

        Collections.sort(list,(p1,p2)->{
            return (int)(p1.price - p2.price);
        });

        for(Prod p:list){
            System.out.println(p.name+" "+p.price);
        }

    }
}  