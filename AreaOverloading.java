public class area{

    void area_rectangle(float length,float width)
    {
        System.out.printf("\nAREA OF RECTANGLE IS:%f",length*width);
    }
    
    void area_triangle(float length,float width)
    {
        System.out.printf("\nAREA OF TRIANGLE IS:%f",0.5f*length*width);
    }

    void area_cone(float radius,float length)
    {
        System.out.printf("\nAREA OF CONE IS:%f",3.14f*radius*(radius+length));
    }
    void area_sphere(float radius)
    {
        System.out.printf("\nAREA OF SPHERE IS:%f",4*3.14f*radius*radius);
    }
    public static void main(String args[])
    {
        area ob=new area();
        ob.area_rectangle(6.5f,5.3f);
        ob.area_triangle(5.6f,8.9f); 
        ob.area_cone(7.5f,6.3f);
        ob.area_sphere(5.7f);
    }
}
