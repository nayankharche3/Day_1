/**
 * Created by ADMIN on 7/2/17.
 */
@FunctionalInterface
interface Abc{
    public void met(int a);
    
    //public void met2();
}


public class Lambda1 {
    public static void main(String[] args) {

    	Abc fa = (x)->{
            System.out.println("Test Purpose" + x);
            System.out.println("one mroe stmt");
        };
        
        fa.met(10);
        
        //xyz();
    }
    /*
    static void xyz()
    {
    	System.out.println("xyzzzzzzzzzzzzz..........");
    	
    	Abc fa = ()->{
            System.out.println("Test Purpose");
        };
        
        fa.met();
    }*/
}
