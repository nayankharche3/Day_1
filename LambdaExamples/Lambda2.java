/**
 * Created by ADMIN on 7/2/17.
 */
interface Abc9{
    public void met();
}

public class Lambda2 {
    public static void main(String[] args) {
        Abc9 fa = ()->{
            System.out.println("Test Purpose");
        };
        
        fa.met();
        
        xyz();
    }
    
    static void xyz()
    {
    	System.out.println("xyzzzzzzzzzzzzz..........");
    	
    	Abc9 fa = ()->{
            System.out.println("Test Purpose");
        };
        
        fa.met();
    }
}
