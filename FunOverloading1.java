public class fun_overloading1 {
    void add(int a,int b)
    {
        System.out.printf("\nADDITION:%d",a+b);
    }
    void add(int a,float b)
    {
        System.out.printf("\nADDITION:%f",a+b);
    }
    void add(String s1,String s2)
    {
        System.out.printf("\nADDITION:%s",s1+s2);
    }
    void add(float a,float b)
    {
        System.out.printf("\nADDITION:%f",a+b);
    }
    public static void main(String args[])
    {
        fun_overloading1 obj=new fun_overloading1();
        obj.add("Obito", "Rin");
        obj.add(5.6f, 5.3f);
        obj.add(5, 4.5f);
        obj.add(10,10);
    }
}
