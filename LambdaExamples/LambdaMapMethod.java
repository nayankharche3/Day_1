import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by ADMIN on 7/2/17.
 */
public class LambdaMapMethod {

    public static void main(String args[]) {
        String[] myArray = new String[]{"raju", "kiran", "ramu", "ravi"};
        Stream<String> myStream = Arrays.stream(myArray);

        Stream<String> myNewStream =
                myStream.map(s -> s.toUpperCase());

        myNewStream.forEach((item)->{System.out.println(item);});

        Stream<String> myStream1 = Arrays.stream(myArray);
        Stream<String> myNewStream1 =
                myStream1.filter((s) ->s.length()<=4 );
        
        myNewStream1.forEach((item)->{System.out.print(item+"\t");});

        System.out.println();
        
        Stream<Integer> intStream =
                myStream.map((s) ->s.length());
        intStream.forEach((item)->{System.out.print(item+"\t");});
        
        String str =
                myStream.reduce("", (str1,str2) ->str1+str2);
        System.out.println("Concatenated STring:  "+str);
    }
}
