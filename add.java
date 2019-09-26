import java.util.*;
abstract class shape
{
  int a,b;
  abstract void printArea();
  shape()
   {
     a=0;
     b=0;
    }
  shape(int x,int y)
  { 
     a=x;
     b=y;
  }
  shape(int r)
  { 
    a=r;
   }
}
 
class rectangle extends shape
{
   double area;
   rectangle(int a,int b)
  {
     super(a,b);
   }
   void printArea()
  {
       area=a*b;
       System.out.println("\nArea of rectangle:"+area);
  }
}
class triangle extends shape
{
  double area;
  triangle(int a,int b)
   {
     super(a,b);
    }
   void printArea()
    {
        
        area=0.5*a*b;
        System.out.println("\nArea of triangle:"+area);
     }
}
class circle extends shape
{ 
  double area;
  circle(int a)
  {
    
     super(a);
   }
   void printArea()
   {
     area=3.14*a*a;
     System.out.println("\nArea of circle:"+area);
    }
}

class add
{
  public static void main(String args[])
   {
      Scanner s=new Scanner(System.in);
      int op,x,y;
      System.out.print("Enter length of rectangle:");
      x=s.nextInt();
      System.out.print("Enter breadth of rectangle:");
      y=s.nextInt();
      rectangle r=new rectangle(x,y);
      r.printArea();
      System.out.print("---------------------------");
      System.out.print("\nEnter breadth of traingle:");
      x=s.nextInt();
      System.out.print("Enter height of traingle:");
      y=s.nextInt();
      triangle t=new triangle(x,y);
      t.printArea();
      System.out.print("\n-------------------------\n");
      System.out.print("\nEnter radius of circle:");
      x=s.nextInt();
      circle c=new circle(x);
      c.printArea();
    }
}
       


