import java.util.Scanner;
class Student{
   public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Radius");
   int radius=sc.nextInt();
   float area=3.14f*radius*radius;
   System.out.println("Area Of Circle is "+ area);
  }
} 