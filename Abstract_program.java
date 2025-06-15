import java.util.*;
abstract class order
{
    int member_id;
    String des;
    Scanner sc=new Scanner(System.in);
    abstract void accept();
    abstract void display();
}
class purchase_order extends order
{
    String cname;
    void accept()
    {
        System.out.print("ENTER PURCHASE ID:");
        member_id=sc.nextInt();
        System.out.print("ENTER CUSTOMER NAME:");
        cname=sc.next();
        System.out.print("ENTER PRODUCT DESCRIPTION:");
        des=sc.next();
    }
    void display()
    {
        System.out.println("PURCHASE ID:"+member_id);
        System.out.println("CUSTOMER NAME:"+cname);
        System.out.println("PRODUCT DESCRIPTION:"+des);
    }
}
class sales_order extends order
{
    String vname;
    void accept()
    {
        System.out.print("ENTER SALES ID:");
        member_id=sc.nextInt();
        System.out.print("ENTER VENDER NAME:");
        vname=sc.next();
        System.out.print("ENTER PRODUCT DESCRIPTION:");
        des=sc.next();
    }
    void display()
    {
        System.out.println("SALES ID:"+member_id);
        System.out.println("VENDER NAME:"+vname);
        System.out.println("PRODUCT DESCRIPTION:"+des);
    }
}
public class Abstract_program {
    public static void main(String[] args) {
        purchase_order ob1[]=new purchase_order[3];
        sales_order ob2[]=new sales_order[3];
        for(int i=0;i<3;i++)
        {
            ob1[i]=new purchase_order();
            ob1[i].accept();
        }
        for(int i=0;i<3;i++)
        {
            ob2[i]=new sales_order();
            ob2[i].accept();
        }
        System.out.println("DETAILS :");
        for(int i=0;i<3;i++)
        {
            ob1[i].display();
        }
        for(int i=0;i<3;i++)
        {
            ob2[i].display();
        }
    }
}
