import java.util.*;
class forEachMethod{
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");
    // print list using 'forEach() method'
    // All this happens because of Consumer interface
    list.forEach(i->System.out.println(i)); // where '->' is lambda expression

    // print list using method reference without object
    list.forEach(System.out::println);
    }
    
}
