class A{
    void disp()
    {
        System.out.println("I AM BASE CLASS");
    }
}

class B extends A
{
    void disp()
    {
        super.disp();
        System.out.println("I AM DERIVED CLASS");
    }
}

public class supermethod {
    public static void main(String[] args) {
        B ob=new B();
        ob.disp();
    }
}
