package AbstractClass2;

public class Circle extends Shape {

    double r, PI = 3.1416;

    @Override
    void area() {
      r=5.23;
      double a;
      a=r*r*PI;
        System.out.println("The circle Shape is : "+a);
           
    }

}
