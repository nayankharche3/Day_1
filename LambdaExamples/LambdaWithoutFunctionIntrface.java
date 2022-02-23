//@FunctionalInterface
interface Abc6{
    public void met(int a);
}

public class LambdaWithoutFunctionIntrface {
	public static void main(String args[]){
		Abc6 fa = (x)->{
	        System.out.println("Test Purpose" + x);
	        System.out.println("one mroe stmt");
	    };
	    
	    fa.met(10);
	}
}
