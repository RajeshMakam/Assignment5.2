package areaperimeter;

abstract class Figure {
 
abstract void findArea();
abstract void findPerimeter();
 
}
 
class Circle extends Figure{
   
    double radius;
    final static double pi = 3.14;
   
    public Circle(double radius)
    {
        this.radius = radius;
    }
   
   public void findArea() {
       double area = pi * radius * radius;
      System.out.println("Area of Circle is "+area); 
    }
   
    public void findPerimeter() {
        double perimeter = 2 * pi * radius;
         System.out.println("Perimeter of Circle is "+perimeter);
    }
}
 
class Rectangle extends Figure {
    
    double width;
    double length;
   
    public Rectangle(double width,double length)
    {
        this.width = width;
        this.length = length;
    }
   
   public void findArea() {
       double area = width * length;
      System.out.println("Area of Rectangle is "+area); 
    }
   
    public void findPerimeter() {
        double perimeter = 2 * (width + length);
         System.out.println("Perimeter of Rectangle is "+perimeter);
    }
}
 
class Triangle extends Figure {
   
    double height;
    double base;
    double a;
    double b;
    double c;
   
    public Triangle(double height,double base,double a,double b,double c)
    {
        this.height = height;
        this.base = base;
        this.a = a;
        this.b = b;
        this.c = c;
    }
   
   public void findArea() {
       double area = (height * base) / 2 ;
      System.out.println("Area of Triangle is "+area); 
    }
   
    public void findPerimeter() {
        double perimeter = a+b+c;
         System.out.println("Perimeter of Triangle is "+perimeter);
    }
}
public class MyJavaProgram {
 
   public static void main(String []args) {
       Figure obj1 = new Circle(4);
        obj1.findArea();
        obj1.findPerimeter();
       Figure obj2 = new Rectangle(2,6);
        obj2.findArea();
        obj2.findPerimeter();
       Figure obj3 = new Triangle(2,6,1.2,2.3,3);
        obj3.findArea();
        obj3.findPerimeter();
   }
}
