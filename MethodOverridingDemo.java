class A 
{
    void show()
    {
        System.out.println("I AM BASE CLASS");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("I AM DERIVED CLASS");
    }
}

public class method_overriding {
 public static void main(String[] args) {
    B ob=new B();
    ob.show();
 }   
}
