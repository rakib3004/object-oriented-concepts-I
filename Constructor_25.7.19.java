import java.util.Scanner;

public class MainClass {
    public static void main (String[] args) {
        Scanner scan= new Scanner(System.in);
         CalculationSystem cal1 = new CalculationSystem(45,64);
         CalculationSystem cal2 = new CalculationSystem(78,64,45);
         CalculationSystem cal3 = new CalculationSystem(45,64,45,75);
         CalculationSystem cal4 = new CalculationSystem(45.45,64.5245);
         CalculationSystem cal5 = new CalculationSystem(45.454,64.57,44.44);
         CalculationSystem cal6 = new CalculationSystem(45.545,64.45,24.524,45.44);
    }
      }
      
      
 class CalculationSystem {

    int a,b,c,d;
    double p,q,r,s;
    int result_int;
    double result_double;
CalculationSystem(int m,int n)
{
   a=m;
   b=n;
   result_int=a+b;
   System.out.println(result_int);
}

CalculationSystem(int m,int n,int x)
{
  a=m;
  b=n;
  c=x;
    result_int=a+b+c;
    System.out.println(result_int);
}

CalculationSystem(int m,int n,int x,int y)
{
  a=m;
  b=n;
  c=x;
  d=y;

    result_int=a+b+c+d;
    System.out.println(result_int);

}
CalculationSystem(double m,double n)
{
   p=m;
   q=n;
    result_double=p+q;
    System.out.println(result_double);
}

CalculationSystem(double m,double n,double x)
{
p=m;
  q=n;
  r=x;
    result_double=p+q+r;
    System.out.println(result_double);
}

CalculationSystem(double m,double n,double x,double y)
{
  p=m;
  q=n;
  r=x;
  s=y;
    result_double=p+q+r+s;
    System.out.println(result_double);
}
    }

