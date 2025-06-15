public class main_overloading {
    public void main()
    {
        System.out.println("ONE");
    }
    public void main(int arg)
    {
        System.out.println("TWO");
    }
    public static void main(String args[])
    {
        System.out.println("THREE");
        main_overloading obj=new main_overloading();
        obj.main();
        obj.main(5);
        obj.main("rbnb");
    }
    public void main(String arg)
    {
        System.out.println("FOUR");
    }
}
