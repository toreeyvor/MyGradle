package ru.stqua.mygradle.pack;

public class HelloWorld {
    public static void main(String[] args) {

        Hello("Vic");
        Hello("You");
        Hello("Everyone");

        Square s = new Square(5);
        s.l = 5;
        System.out.println("Площаь квадрата со стороной" + s.l + " = " + area(s));

        Rectagule r = new Rectangle(4, 6);
        System.out.println("Площать прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
      }

  public static void Hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");

  }
  public static double area(Square s) {
    return s.l * s.l;
  }

  public static double area(Rectagle r){
    return r.a * r.b;

  }
}
