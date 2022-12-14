/*Interfaces in Java
Before Java 8, all the methods inside interface are only abstract,
But after Java 8 , we can define methods using default keyword
and java 8 also made that possible to define methods as 'static'
Let's see*/
interface I{
    void add(); // public abstract void add()-> both are same
    static void show(){
        System.out.println("I");
    }
}
interface J{
    void add(); // public abstract void add()-> both are same
    default void show(){
        System.out.println("J");
    }
}
class A{
    public void add(){
        System.out.println("Inside A class add method");
    }
    public void show(){
        System.out.println("A");
    }
}
class B extends A implements I,J{
    public  void add(){
        System.out.println("Inside B class add method");
    }
    public void show(){
        // I.show();
        J.super.show();
        System.out.println("B");
    }
    public static void main(String args[]){
        B b = new B();
        I.show(); // we can directly access static methods with class Name
        b.add();
        b.show();
    }
}
