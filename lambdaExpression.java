import java.util.*;
interface I{
    void show();
}
class A implements I{
    public void show(){
        System.out.println("Inside A");
    }
}
class B extends A{
    public static void main(String args[]){
        I i = new A();
        i.show();
    }
}
