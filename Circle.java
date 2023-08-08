package Opps;

public class Circle {
 static double r;

Circle()//constructor without parameter
{
	this.r=5;
}
//Constructor with two arguments
//public Circle(double r) {
//    this.r= r;
//}
public static void main(String[]args) {
Circle obj = new Circle();//(type value)

double a=( 2*3.142);
System.out.println(a*obj.r);
}
}
