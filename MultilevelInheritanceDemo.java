import java.util.*;

class Grandfather
{
    Scanner sc=new Scanner(System.in);
    String gname;
    void acceptg()
    {
        System.out.print("ENTER GRANDFATHER NAME:");
        gname=sc.next();
    }
}

class Father extends Grandfather
{
    String fname;
    void acceptf()
    {
        System.out.print("ENTER FATHER NAME:");
        fname=sc.next();
    }
}

class Child extends Father
{
    String cname;
    void acceptc()
    {
        System.out.print("ENTER CHILD NAME:");
        cname=sc.next();
    }
    void disp()
    {
        System.out.println("GRANDFATHER NAME:"+gname);
        System.out.println("FATHER NAME:"+fname);
        System.out.println("CHILD NAME:"+cname);
    }
    
}

public class multilevel_inheritance {
    public static void main(String[] args) {
     Child ob=new Child();
     ob.acceptg();
     ob.acceptf();
     ob.acceptc();
     ob.disp();   
    }
}
