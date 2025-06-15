import java.util.Scanner;

interface Operation
{
    void area();
    void volume();
    Scanner sc=new Scanner(System.in);
    final float PI=3.14f;
}

class cylinder implements Operation
{
    float radius,height;
    void accept()
    {
        System.out.print("ENTER RADIUS OF CYLINDER:");
        radius=sc.nextFloat();
        System.out.print("ENTER HEIGHT OF CYLINDER:");
        height=sc.nextFloat();
    }
    public void area()
    {
        System.out.println("AREA OF CYLINDER IS:"+(2*PI*radius*height));
    }
    public void volume()
    {
        System.out.println("VOLUME OF CYLINDER IS:"+(PI*radius*radius*height));  
    }
}

public class interface_program1 {
    public static void main(String args[]) {
        cylinder ob=new cylinder();
        ob.accept();
        ob.area();
        ob.volume();
    }
}
