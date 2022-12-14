// Normal way of executing interface method i.e creating another class and defining the method there
/*
interface K{
    void add();
}
class X implements K{ // Creating class 'X' 
    public void add(){ // Defining the interface method here
        System.out.println("Inside A class ");
    }
}
class lambdaExpression extends X {
    public static void main(String[] args) {
        K k = new X(); // For any interface we can only make reference but cannot create object i.e K k = new K() is not possible, we have to take help of class
        k.add();
    }
    // In the below code let's discuss how to do the same process without creating class X using Anonymous class
}*/

// *********Using Anonymous class**********
/*interface K{
    void add();
}
class lambdaExpression {
    public static void main(String args[]){
        K k = new K(){ // instead of creating seperate class we are declaring the class here itself
            public  void add(){
                System.out.println("I am Anonymous class");
            }
        };
        k.add();
    }
}*/

// **********Using lambda Exrpession***********
interface K{
    void add();
}
class lambdaExpression{
    public static void main(String args[]){
        K k = ()->System.out.println("Using lambda"); // No need to write method inside class again. We can access directly
    k.add();
    }
}