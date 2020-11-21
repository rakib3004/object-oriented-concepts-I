//Main Class

package src.RetailSystem;


import javax.swing.*;
import java.awt.*;

public class MainClass {


    public static void main(String[] args) {

MyTriangle test_driver = new MyTriangle();

test_driver.example();
test_driver.show_triangle();

System.exit(0);
    }
}



//MyCircle Class


class MyCircle   {
    private   MyPoint center  = new MyPoint(0,0);
   private  int radius = 1;
   private  int x;
   private  int y;
   private  int XY;
  public MyCircle(){

   }

   public MyCircle(int x , int y , int radius){
this.x = x;
this.y = y;
this.radius  =radius;
   }

   public MyCircle(MyPoint center , int radius){
       this.x = center.getX();
       this.y = center.getY();
       this.radius  =radius;
   }
   public  int getRadius(){
      return  this.radius;
   }

    public void setRadius(int radius) {
        this.radius = radius;
    }



   public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return x;
    }

    public void setCenterX(int x) {
        this.x = x;
    }

    public int getCenterY() {
        return y;
    }

    public void setCenterY(int y) {
        this.y = y;
    }

    public int getCenterXY() {
        return XY;
    }

    public void setCenterXY(int x, int y) {
this.x = x;
  this.y = y;
  }

    public  String toString(){
      return "My Circle [ radius = "+radius+",center = ("+x+","+y+")]";
    }
    public  double getArea(){
      double area;
      double pie =3.1416;
      area =  pie* Math.pow(radius,2);
      return  area;
    }
    public  double getCircumference(){
      double   circumference ;
        double pie =3.1416;

        circumference = 2 * pie  * radius ;
      return circumference;
  }
    public double distance(MyCircle circle){

      double distance = Math.sqrt(((circle.getCenterX()-x)*(circle.getCenterX()-x))-((circle.getCenterY()-y)*(circle.getCenterY()-y)));
      return  distance;
    }


}


//MyTriangle Class


  class MyTriangle extends Shape  {
    MyTriangle array_of_point [] = new MyTriangle[4];
    MyCircle array_of_point2 [] = new MyCircle[3];
    MyPoint points[] = new MyPoint[6];

    public void example(){

        points[0]=new MyPoint(1,0);
        points[1]=new MyPoint(7,0);
        points[2]=new MyPoint(4,5);
        points[3]=new MyPoint(3,2);
        points[4]=new MyPoint(11,2);
        points[5]=new MyPoint(7,0);
        array_of_point[0]=new MyTriangle(points[0],points[1],points[2]);
        array_of_point[1] = new  MyTriangle(points[3],points[4],points[5]);
        array_of_point[2] = new  MyTriangle(1,0,7,0,4,5);
        array_of_point[3] = new  MyTriangle(3,2,11,2,7,0);

        array_of_point2[0] =new MyCircle(2,1,5);
        array_of_point2[1] =new MyCircle(points[5],14);
        array_of_point2[2] =new MyCircle(points[4],7);

    }
    public  void  show_triangle(){

        JOptionPane.showMessageDialog(null,array_of_point[0].toString());
        JOptionPane.showMessageDialog(null,"The perimeter of triangle :"+array_of_point[0].getPerimeter());
        JOptionPane.showMessageDialog(null,"The type of triangle :"+array_of_point[0].getType());

        JOptionPane.showMessageDialog(null,array_of_point[3].toString());
        JOptionPane.showMessageDialog(null,"The perimeter of triangle :"+array_of_point[3].getPerimeter());
        JOptionPane.showMessageDialog(null,"The type of triangle :"+array_of_point[3].getType());

        JOptionPane.showMessageDialog(null,array_of_point2[0].toString());
        JOptionPane.showMessageDialog(null,"The Area of circle :"+array_of_point2[0].getArea());
        JOptionPane.showMessageDialog(null,"The circumference of circle :"+array_of_point2[0].getCircumference());
        JOptionPane.showMessageDialog(null,array_of_point2[1].toString());
        JOptionPane.showMessageDialog(null,"The Area of circle :"+array_of_point2[1].getArea());
        JOptionPane.showMessageDialog(null,"The circumference of circle :"+array_of_point2[1].getCircumference());
        JOptionPane.showMessageDialog(null,"The distance between two circle :"+array_of_point2[1].distance(array_of_point2[2]));


    }

    private  MyPoint v1;
    private  MyPoint v2;
    private  MyPoint v3;
    private int x1;
    private int x2;
    private int x3;
    private int y1;
    private int y2;
    private int y3;
    public MyTriangle(){
    }

  public   MyTriangle(int x1,int y1, int x2, int y2, int x3,int y3 ){
this.x1 = x1;
this.x2 = x2;
this.x3 = x3;
this.y1 = y1;
this.y2 = y2;
this.y3 = y3;
    }
public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
    this.x1 = v1.getX();
    this.x2 = v2.getX();
    this.x3 = v3.getX();
    this.y1 = v1.getY();
    this.y2 = v2.getY();
    this.y3 = v3.getY();
    }

    public  String toString(){
        return  "My Triangle [v1("+x1+","+y1+"),v2("+x2+","+y2+"),v2("+x3+","+y3+") ]";
    }

    public double getPerimeter(){
       double side1=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
       double side2=Math.sqrt(((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3)));
       double side3=Math.sqrt(((x3-x2)*(3-x2))+((y3-y2)*(y3-y2)));
       double perimeter = side1 + side2 + side3;
       return  perimeter;

    }
    public  String getType(){
        double side1=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
        double side2=Math.sqrt(((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3)));
        double side3=Math.sqrt(((x3-x2)*(3-x2))+((y3-y2)*(y3-y2)));
        if((side1==side2)&&(side2==side3)){
            return "Equilateral";
        }
        else if((side1==side2)||(side2==side3)){
            return "Isoscalence";
        }
        return "Scalence";

    }

}
//MyPoint Class

package ShapeSystem;

public class MyPoint {
    private int x;
    private int y;
    public MyPoint(int x, int y){
        this.x =x;
        this.y = y;
    }
    public int getX(){
       return x;
    }
    public int getY(){
       return y;
    }
}




