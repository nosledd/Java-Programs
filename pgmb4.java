/* 4. Program to create an abstract class named shape that contains two integers and an empty pethod named printArea(). 
Provide three classes named Rectangle, Triangle and Ellipse such methed printArea() that print the area of the given shape. 
that each one of the classes extends the class shape. Each one of the class contains only the method printArea() that print 
the area of the given shape. */

abstract class shape {
    int a=7,b=5;
    abstract void printArea();
}

class Rectangle extends shape {
 
    void printArea() {
        System.out.println("The area of rectangle is: " +(a*b));
    }

}

class Triangle extends shape {

    void printArea() {
        System.out.println("The area of traingle is: " +(a*b/2));
    }
}

class Eclipse extends shape {

    void printArea() {
        System.out.println("The area of eclipse: " +((22/7)*a*b));
    }
}

public class pgmb4 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Eclipse e=new Eclipse();
        r.printArea();
        t.printArea();
        e.printArea();
    }
}