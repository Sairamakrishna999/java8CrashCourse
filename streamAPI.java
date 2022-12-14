import java.nio.file.DirectoryStream.Filter;
import java.util.*;
import java.util.stream.*;

// Stream API is one of the best features of Java
// for example if you want to double all the values in an array we have to use for loop and lot of stuff but with stream we can easily do it
//Let's see
class StreamAPI{
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1,5,7,8,6,43,9)); // adding multiple values to the list
        
        /*Stream<Integer> stream = list.stream();
        Stream<Integer> stream1 = stream.sorted();
        Stream<Integer> stream3 = stream1.filter(p->p%2==0);
        stream3.forEach(p->System.out.println(p));*/
    // we can do all the above process in one line
       list.stream().sorted().filter(p->p%2==0).forEach(p->System.out.println(p));
    }
}
