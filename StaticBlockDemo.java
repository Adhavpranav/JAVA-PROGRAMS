class demo{
    static int n;
  
    static{
        int num=10;
        n=num;
    }
    void display()
    {
        System.out.println(n);
    }
}
public class static_block {
public static void main(String[] args) {
    demo ob=new demo();
    ob.display();
}    
}
