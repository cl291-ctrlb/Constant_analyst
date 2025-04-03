//Interface unit 10
//An interface is a collection of various methods without definition.
//t. An interface can be implemented by
//        one or more classes; and a class can implement one or more interfaces. Interfaces looks like abstract
//classes, but have differences.

//interface
//you can create an interface and declare methods in it. The definition of a method
//declared in an interface is provided within the class that implements the interface.

//Creating and Using Interface
//interface Myinterface{
//    void  connect();
//}
//class OracleImp implements Myinterface
//{
//    public void connect(){
//        System.out.println("successfully connected to oracle database");
//    }
//}
//
//class SQLImp implements Myinterface
//{
//    public void connect(){  // ✅ Fixed method name
//        System.out.println("connected to sql server database successfully");
//    }
//}
//
//class DemoInterface{
//    public static void main(String args[]) throws Exception{
//        if (args.length == 0) {
//            System.out.println("Error: No class name provided. Use OracleImp or SQLImp.");
//            return;
//        }
//
//        Class c = Class.forName(args[0]);
//        Myinterface obj = (Myinterface) c.getDeclaredConstructor().newInstance(); // ✅ Use getDeclaredConstructor()
//        obj.connect();
//    }
//}



//using interface references
//if you implement an
//interface and provide definition to its methods in a class, then you can assign the object of that class
//to the reference variable of the interface.

//Using Interface Reference with Class Method ( . If you remove the show() method, the program will be compiled and
//executed successfully)
//interface Interface1 {
//    public void display();
//}
//
//public class MyClass implements Interface1 {
//    public void display() {
//        System.out.println("display method");
//    }
//
//    public void show() {
//        System.out.println("showing method");
//    }
//
//    public static void main(String args[]) {
//        Interface1 obj = new MyClass();
//        obj.display();
//
//        // FIX: Casting obj to MyClass to call show() method
//        ((MyClass) obj).show();
//    }
//}







//Using Interface Reference
//interface Interface1 {
//    void display(); // No need to explicitly write 'public', it's public by default
//}
//
//public class MyClass implements Interface1 {
//    @Override
//    public void display() { // Implementing the interface method
//        System.out.println("Display method executed");
//    }
//
//    public static void main(String args[]) {
//        Interface1 obj = new MyClass();
//        obj.display(); // ✅ Now it works!
//    }
//}


//implementing multiple interfaces
// In other languages, such as C++, one class can inherit from multiple classes at once, but this technique
//doesn’t work directly in Java—that is, you can only use the extends keyword with one class at a time.

//there are two ways to implement what amounts to multiple inheritance in Java. The first is
//to use single inheritance in stages

//example
//interface Animal{
//    void eat();
//}
//interface Bird{
//    void fly();
//}
//class Sparrow implements Animal, Bird{
//    public void eat(){
//        System.out.println("sparrow is eating");
//    }
//    public void fly(){
//        System.out.println("Sparrow is flying");
//    }
//}
//public class MultipleInterfaceDemo {
//    public static void main(String[]args){
//        Sparrow obj=new Sparrow();
//        obj.eat();
//        obj.fly();
//    }
//}




//constant in interfaces
//interface MathConstants{
//    double PI=3.14;
//    int MAX_VALUE=100;
//
//}
//public class MultipleInterfaceDemo implements MathConstants {
//    public static void main(String [] args){
//        System.out.println("Value of pi"+PI);
//        System.out.println("max value"+MAX_VALUE);
//
//    }
//}


// Extending Interfaces
//interface Animal{
//    void eat();
//}
//interface Bird extends Animal{
//    void fly();
//}
//
//class Sparrow implements  Bird{
//    public void eat(){
//        System.out.println("sparrow is eating");
//    }
//    public void fly(){
//        System.out.println("Sparrow is flying");
//    }
//}
//public class MultipleInterfaceDemo {
//    public static void main(String[]args){
//        Sparrow obj=new Sparrow();
//        obj.eat();
//        obj.fly();
//    }
//}






//Nested Interfaces
//class OuterClass{
//    interface NestedInterface{
//        void show();
//    }
//}
//class ImplementingClass implements OuterClass.NestedInterface{
//    public void show(){
//        System.out.println("nested interface");
//    }
//}
//public class NestedInterfaceDemo {
//    public static void main(String[] args){
//        OuterClass.NestedInterface obj=new ImplementingClass();
//        obj.show();
//    }
//}


//Variables in interface
//interface Myinterface{
//    int value=100;
//    String Message="hello from interface";
//
//    void display();
//}
//class MyClass implements Myinterface{
//    public void display(){
//        System.out.println("value "+value);
//        System.out.println("message "+Message);
//
//
//    }
//
//}
//public class NestedInterfaceDemo {
//    public static void main(String[] args){
//        MyClass obj = new MyClass();
//        obj.display();
//    }
//}













