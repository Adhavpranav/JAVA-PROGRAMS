import java.util.*;
abstract class shape
{
    Scanner sc=new Scanner(System.in);
    abstract void area();
}
class rectangle extends shape
{
    void area()
    {
        float length,breadth;
        System.out.print("ENTER LENGTH AND BREADTH OF REACTANGLE:");
        length=sc.nextFloat();
        breadth=sc.nextFloat();
        System.out.println("AREA OF RECTANGLE IS:"+(length*breadth));
    }
}

class triangle extends shape
{
    void area()
    {
        float breadth,height;
        System.out.print("ENTER BREADTH AND HEIGHT OF TRIANGLE:");
        breadth=sc.nextFloat();
        height=sc.nextFloat();
        System.out.println("AREA OF TRIANGLE IS:"+(0.5f*breadth*height));
    }
}

public class abstract_class {
    public static void main(String[] args) {
        rectangle ob1=new rectangle();
        triangle ob2=new triangle();
        ob1.area();
        ob2.area();
    }
}
