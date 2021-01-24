package ru.stqua.mygradle.pack;

public class HelloWorld {
    public static void main(String[] args) {
	     System.out.println("Hello world");


  public static void main(String[] args) {
    Hello("Vic");
    Hello("You");
    Hello("Everyone");

    double l = 5;
    System.out.println("Площаь квадрата со стороной" + l + "=" + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Площать прямоугольника со сторонами " + a + " и " + b +  " = " + area(a, b));
  }

  public static void Hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");

  }
  public static double area(double l) {
    return l * l;
  }

  public static double area(double a, double b){
    return a * b;

  }
}
