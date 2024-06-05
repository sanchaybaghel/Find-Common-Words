// class student{
//     String name;
//     int age;
//     public void studentinfo(String name){
//         System.out.println(name);
//     }
//     public void studentinfo(int age){
//         System.out.println(age);

//     }
//     public void studentinfo(String name,int age){
//         System.out.println(name);
//         System.out.println(age);
//     }

// }
import java.util.*;

class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
 }
 class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }  
 }
 class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }  
 }
 
public class OOPS3 {
    public static void main(String[] args) {
     Circle r1=new Circle();  
     

      

    }

    
}
