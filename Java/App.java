//unit 09 inheritance
//nested classes
//an example of creating a subclass by using inheritance
//class Airplane {   // class name stary with uppercase
//    public void fly(){
//        System.out.println("flying");
//    }
//}
//public class main{
//    public static void main (String[] args){
//        Airplane plane  = new Airplane(); // creating an object of airplane class
//        plane.fly();// call fly method
//    }
//}

//declare Passengerplane as a subclass of the Airplane class:
// class Passengerplane extends Airplane{
//    public void land() {
//        System.out.println("landing");
//    }
//}

//public class App{
//    public static void main (String[] args){
//        Passengerplane p = new Passengerplane();
//        p.fly(); // inherited method from Airplane
//        p.land();// method from Passenger plane
//    }
//}


// member access and inheritance
// the fly() method is not only declared private but also accessed in main():
//Because declaring a member by using private restricts that member to its class, Java says it can’t find
//the fly method as used in main:

//Member Access in Sub class
//class Airplane{
//    protected void fly() {
//        System.out.println("flying");
//    }
//}
//class Passengerplane extends Airplane {
//    public void land() {
//        System.out.println("landing");
//    }
//}
//public class App {
//    public static void main(String [] args){
//        Passengerplane p = new Passengerplane();
//        p.fly();
//        p.land();
//    }
//}





// constructors and inheritance
//Adding a Constructor without Parameter
//class Abc{
//    Abc(){
//        System.out.println("in abc\'s constructors");
//    }
//}
//
//class Xyz extends Abc{
//    Xyz(){
//        System.out.println("in xyz\'s constructors");
//    }
//}
//
//public class App {
//    public static void main (String[] args){
//        Xyz obj = new Xyz();
//    }
//} //when you instantiate class Xyz, the constructors from both classes Abc and Xyz are called:


//Adding Constructors with One Parameter
//class Abc{
//    Abc () {
//        System.out.println("in abc\'s constuctor");
//    }
//}
//class Xyz extends Abc{
//    Xyz (String s){
//        System.out.println("xyz \'string constructor");
//        System.out.println("s");
//    }
//}
//public class App {public static void main (String[] args){
//    Xyz obj = new Xyz("hello java");
//}
//}//In this case, the constructors of both classes Abc and Xyz are called:
//A constructor without any parameter is called a default constructor because Java calls it automatically
//when you create an object of any subclass of that class.




// using super to call superclass constructors
// how to call constructor of a super class instead of default
//constructor of subclass:
//class Abc {
//    Abc() {System.out.println("in abc\'s constructor");}
//    Abc(String s) {System.out.println("string construvtor");
//        System.out.println(s);
//    }
//}
//
//class Xyz extends Abc{
//    Xyz(String s){
//        super(s);
//        System.out.println("in xyz string constructor");
//        System.out.println(s);
//    }
//}
//
//public class App {
//    public static void main(String [] args){
//    Xyz obj = new Xyz("hello chomu lal");
//}}   //In this case, when you instantiate class Xyz, the constructor that takes a String parameter in class Abc
//is called instead of the default constructor:
//Why is the constructor that takes a String parameter in class Abc called and not the default constructor
//in class Abc? The reason is that you are using the super() method to call the superclass’s constructor:
//Why is the constructor that takes a String parameter in class Abc called and not the default constructor
//in class Abc? The reason is that you are using the super() method to call the superclass’s constructor:








//using super to access super class members
//the super keyword is a reference variable that is used to refer parent class objects This keyword
//can be used with variables, methods and constructors to refer the super class members./


// accessing superclass members
//class Person{
//    int num  = 25 ;
//    Person()
//    {
//        System.out.println("person class constructor");
//    }
//    void message()
//    {
//        System.out.println("person class");
//    }
//}
//
//// subclass student
//class Student extends Person{
//    int num = 150;
//    Student(){
//        super(); // call parent class constructor
//        System.out.println("student class constructor");
//    }
//
//    @Override
//    void message() {
//      System.out.println("student name : "+ super.num);
//    }
//    void display()
//    {
//        message();// call current class message () method
//        super.message();// call parent class message method
//    }
//}
//
//class Test{
//    public static void main(String args []){
//        Student s = new Student();
//        s.display(); // calling display of student
//    }
//} //Person is the base or super class and Student is the derived or sub class. The super keyword
//is used in the derived class to invoke the members of the super class, including variable num, constructor
//and the message() method.








// creating a multilevel hierarchy
//create a subclass of a subclass of a subclass of a superclass.
//creating objects of the classes
//Passengerplane and Jet:
//class Fighterplane extends Airplane{
//    public void fight(){
//        System.out.println("fighting");
//    }
//}
//class Hawk extends Fighterplane{
//    public void search() {
//        System.out.println("searching");
//    }
//}
//class Jet extends Fighterplane{
//    public void target(){
//        System.out.println("targeting ");
//    }
//}
//public class App {
//    public static void main(String[]args){
//        System.out.println("creat passenger plane");
//        Passengerplane p = new Passengerplane();
//        p.fly();
//        p.land();
//        System.out.println("create jet");
//        Jet j = new Jet();
//        j.fly();
//        j.target();
//    }
//}








// costructors execution(multilevel constructor use)
//class A {
//    A() {
//        System.out.println("Constructing a ");
//    }
//}
//class B extends A {
//    B() {
//        System.out.println("Constructing b ");
//    }
//}
//class C extends B {
//    C() {
//        System.out.println("Constructing c");
//    }
//}
//class D extends C {
//    D() {
//        System.out.println("Constructing d ");
//    }
//}
//
//public class App {
//    public static void main(String [] args){
//        D obj = new D();
//    }
//} //Java called A’s constructor first, then B’s, then C’s, then D’s, not in the reverse order as
//you might expect. Why does Java do it this way? Because when you create subclasses, you proceed from
//the general to the specific, which means that class A knows nothing about class B, class B knows nothing
//        about class C, and so on. For that reason, Java calls the original subclass’s constructor first, then the
//next, and so on. Because class B knows about class A, it might rely on certain parts of A being initialised
//        before completing its own initialisation, and the same for class C with respect to class B, and so on.
//It’s also worth noting that you can pass parameters back multiple levels. However, all constructors in
//the subclassing chain must still be called in anascending order













//super class reference and subclass objects
//a subclass
//object’s reference can be assigned to a reference variable of superclass. For example, class Abc is a
//        superclass of Xyz and you have a variable of Abc, then the reference of an object of class Xyz can be stored
//        in a variable of type Abc.

//class Airplane {   // class name stary with uppercase
//    public void fly(){
//        System.out.println("flying");
//    }
//}
//class Passengerplane extends Airplane{
//    public void land() {
//        System.out.println("landing");
//    }
//}
//
//class Fighterplane extends Airplane{
//    public void fight(){
//        System.out.println("fighting");
//    }
//}
//class Hawk extends Fighterplane{
//    public void search() {
//        System.out.println("searching");
//    }
//}
//class Jet extends Fighterplane {
//    public void target() {
//        System.out.println("targeting ");
//    }
//
//public class App {  //create new objects of the Passengerplane and Jet classes, we can use this code:
//    public static void main(String[] args) {
//        System.out.println("create fighter plane");
//        Fighterplane fp = new Fighterplane();
//        fp.fly();
//        fp.fight();
//        System.out.println("creating jet");
//        Jet j = new Jet();
//        j.fly();
//    }
//
//}
//we can also assign the new Jet object to a variable of class Airplane as follows:

//    public static void main(String[] args)  {
//    System.out.println("creating fighterplane");
//    Fighterplane fp = new Fighterplane();
//    fp.fly();
//    fp.fight();
//    System.out.println("creating jet");
//    Airplane a = new Jet();
//    a.fly();}}
//Note that we commented out the lines j.fight() and j.target() here because those methods are defined in
//the Fighterplane and Jet classes, which are subclasses of Airplane, which means that those methods
//can’t be used with a variable of class Airplane.
//Generally, the object variable a will only allow access to items present in its own class. It’ll not allow
//access to any member that doesn’t belong to the class Airplane.








//method overriding
//You can also override methods that you inherit from a superclass, which means that you replace them
//with a new version.


//class Animal {
//    public void breathe(){
//        System.out.println("saas");
//        }}
//
//class Fish extends Animal{
//        public void breathe(){System.out.println("bubbling");}
//}

//public class App {
//    public static void main(String[] args) {
//        System.out.println("Creating an animal");
//        Animal a = new Animal();
//        a.breathe();
//
//        System.out.println("Creating a lung fish");
//        Fish f = new Fish();
//        f.breathe();
//    }
//}







// dynamic method dispatch
//runtime polymorphism that lets you to wait until the
//program gets executed before deciding the object whose reference is to be stored.
//In this case, we’ll create a superclass named W, a subclass of
//W named X, a subclass of X named Y, and a subclass of Y named Z, each of which has a print() method:
//class W {
//    public void print(){
//        System.out.println("w");
//    }}
//
//class X extends W{
//        public void print(){
//            System.out.println("X");
//        }
//}
//class Y extends X{
//        public void print(){
//            System.out.println("y");
//        }
//    }
//
//
//    class Z extends Y{
//        public void print(){
//            System.out.println("z");
//        }
//    }
////create an object reference of each class type:
//public class App{
//        public static void main (String[] args){
//            W w1= new W();
//            X x1=  new X();
//            Y y1 = new Y();
//            Z z1 = new Z();
//            W ref;
//            ref = w1; ref.print();
//            ref = x1; ref.print();
//            ref = y1; ref.print();
//            ref = z1; ref.print();
//
//
//        }
//} // Using runtime polymorphism, you can write a code that will work with many different types of objects
//and decide on the actual object type at runtime. Note that the restrictions mentioned in the previous topic
//still apply. The object variable a will only allow access to items present in its own class. It’ll not allow
//access to any member that doesn’t belong to class A.



//abstract classes

//abstract class A {
//    abstract String getData();
//    public void print() {
//        System.out.println(getData());
//    }}
//class B extends A {
//    String getData() {
//       return "Hello from b";
//    }
//}
//public class App {
//        public static void main(String[] args) {
//            B b1 = new B();
//            b1.print();
//        }
//    }



// using final with ineritance(stop overriding of methods by using the final keyword)
//class Animal {
//    public void breathe(){
//        System.out.println("saas");
//        }}
//
//class Fish extends Animal{
//        public void breathe(){System.out.println("bubbling");}
//}
//If for some reason you don’t want to let anyone override the breathe() method, you can declare it final
//as follows:
//class Animal {
//    public void breathe(){
//        System.out.println("saas");
//    }}
//
//class Fish extends Animal{
//    public void breathe(){System.out.println("bubbling");}
//}
//public class App {
//    public static void main(String[] args){
//        System.out.println("create animal");
//        Animal a = new Animal();
//        a.breathe();
//        System.out.println("create lungfish");
//        Fish f = new Fish();
//        f.breathe(); //
//
//
//    }
//}
//redo
//class Animal {
//    final void breathe() { System.out.println("Breathing"); }
//}
//class Fish extends Animal {
//    public void breathe() { System.out.println("Bubbling"); }
//}
//public class App {
//    public static void main(String[] args) {
//        System.out.println("Creating an animal...");
//        Animal a = new Animal(); a.breathe();
//        System.out.println("Creating a lungfish...");
//        Fish f = new Fish(); f.breathe(); }
//}

// using final class
//final class Animal {
//    public static void main(String[] args) {
//        System.out.println("saas");}
//class Fish extends Animal{
//        public void breathe() {
//            System.out.println("bubbling");
//        }
//}
//public class App{
//        public static void main(String[] args){
//            System.out.println("create an jaanvar");
//            Animal a = new Animal();
//            Animal.breathe();
//            System.out.println();
//            System.out.println("create lung fish");
//            Fish f = new Fish();
//            f.breathe();
//
//        }
//}
//}




// is-a vs has-a relationships
//is a
//class A extends B{
//    A(){print();}
//}
//class B{
//    void print(){System.out.println("comes from b class ");}}
//
//public class App{
//        public static void main(String[]args){
//            A obj = new A();
//        }
//}

// has
//class A{
//    B b1;
//    A() {b1 = new B();
//    b1.print();}
//}
//class B{
//    void print(){
//        System.out.println("comes from b class");
//    }
//}
//public class App {
//    public static void main(String[] args){
//        A obj = new A();
//    }
//}









// object class (All classes in Java are derived automatically from the java.lang.Object class,)
//class A{
//     public void print(){
//         System.out.println("here a");
//     }
//        }
//class B extends  A {
//    public void print(){
//        System.out.println("here b");
//    }
//}
//class C extends A {
//    public void print(){
//        System.out.println("here c");
//    }
//}
//class D extends A {
//    public void print(){
//        System.out.println("here d");
//    }
//}
//public class App {
//    public static void main(String[] args){ // create an instance of each class and a variable of class A named aref
//        A a1 = new A();
//        B b1 = new B();
//        C c1 = new C();
//        D d1 = new D();
//        A aref;
//        aref = a1;
//        System.out.println("aref class now "+ aref.getClass());
//        aref.print();
//        aref = b1;
//        System.out.println("aref class now "+ aref.getClass());
//        aref.print();
//        aref = c1;
//        System.out.println("aref class now "+ aref.getClass());
//        aref.print();
//        aref = d1;
//        System.out.println("aref class now "+ aref.getClass());
//        aref.print();
//
//
//
//
//    }
//}


// lab exercise
//Write a Java program to implement a superclass Shape and its subclasses Square, Rectangle and
//Triangle. Calculate the area of each shape using abstract classes and methods.
//abstract class Shape{
//    public abstract double area();
//}
//class Sqare extends Shape{
//    protected double side;
//    public Sqare (double s){
//        this.side = s;
//    }
//    public double area(){
//        return side * side;
//    }
//}
//class Rectangle extends Shape{
//    protected double width, height;
//    public Rectangle (double w,double h){
//        this.width =w ;
//        this.height = h;
//    }
//    public double area()
//    {
//        return width* height;
//    }
//}
//class Triangle extends Shape{
//    protected double breadth, height;
//        public Triangle(double b, double h){
//        this.breadth = b;
//        this.height = h;
//    }public double area (){
//        return ((breadth * height)/2);
//    }
//}
//class Calculate{
//    public static void main(String[] args){
//        Shape sp = new Sqare(10);
//        System.out.println("square ka area"+sp.area());
//        sp = new Rectangle(2.4, 5);
//        System.out.println("rectangle ka area"+ sp.area());
//        sp = new Triangle(4,5);
//        System.out.println("triangle ka area"+ sp.area());
//    }
//}
//m, we have create an abstract class named Shape with an abstract method named area( ).
//The Shape class is inherited by Square, Rectangle and Triangle classes. All these overridden the area( )
//method of the Shape class. In the Calculate class, we have created an instance of the Shape class and
//assigned the object of the Square, Rectangle and Triangle classes. Desired parameters are passed to the
//constructors of the Square, Rectangle and Triangle classes






















































































































