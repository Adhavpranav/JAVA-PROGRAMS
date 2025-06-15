import java.util.*;
class student{
    static String tname="Shital";
    int rno;
    String name;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.print("ENTER STUDENTS ROLL NUMBER:");
        rno=sc.nextInt();
        System.out.print("ENTER STUDENTS NAME:");
        name=sc.next();
    }
    void display()
    {
        System.out.println("STUDENT NO"+rno);
        System.out.println("STUDENT NAME:"+name);
        System.out.println("TEACHERS NAME:"+tname);
    }
} 
public class static_programs {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("ENTER THE LIMIT:");
    int limit=sc.nextInt();
    student obj[]=new student[limit];
    for(int i=0;i<limit;i++)
    {
        obj[i]=new student();
        obj[i].accept();
    }
    System.out.println("STUDENTS DETAILS:");
    for(int i=0;i<limit;i++)
    {
        obj[i].display();
    }
    sc.close();
    }   
}
