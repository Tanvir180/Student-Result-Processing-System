
package MultipleInterface;

public class Circle implements Area,Perimeter {
   @Override
    public double calculatearea(double radius)
    {
        double result = radius * radius ;
        return result ;
    }
  
    @Override
    public double calculateperimeter(double radius)
    {
        double result = radius +radius ;
        return result;
    }
}
