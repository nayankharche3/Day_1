import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by ADMIN on 7/2/17.
 */
public class LambdaStreams {
    public static void main(String args[])
    {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(11);
        myList.add(52);
        myList.add(18);

// Convert it into a Stream
        Stream<Integer> myStream = myList.stream();

        //How to convert Array into Stream
        // Create an array
        Integer[] myArray = {11, 54, 81};

    // Convert it into a Stream
        Stream<Integer> myAStream = Arrays.stream(myArray);
    }
}
