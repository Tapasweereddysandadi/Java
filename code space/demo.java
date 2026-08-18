import java.util.Scanner;

abstract class Shape{
      int length,breadth,radius,base,height;
      Scanner sc= new Scanner(System.in);
   
       abstract void printArea();
}
class Rectangle extends Shape{
       void printArea(){
          System.out.println("Length : ");
           length=sc.nextInt();
          System.out.println("Breadth : ");
           breadth=sc.nextInt();
          System.out.println("Area of Rectangle : " +(length * breadth));
    }
}
class Triangle extends Shape{
       void printArea(){
          System.out.println("Base : ");
           base=sc.nextInt();
          System.out.println("Height :");
           height=sc.nextInt();
          System.out.println("Area of Triangle : " +(0.5 * base * height));
    }
}
class Circle extends Shape{
       void printArea(){
          System.out.println("Radius : ");
           radius=sc.nextInt();
          System.out.println("Area of Circle : " +(3.14 * radius * radius));
    }
}
public class demo{
     public static void main(String args[]){
          Shape s;

          s = new Rectangle();
          s.printArea();
            
          s = new Triangle();
          s.printArea();
 
          s = new Circle();
          s.printArea();
      }
}






