import java.util.*;
class College
{
    int cid;
    String cname,cadd;
    Scanner sc=new Scanner(System.in);
    void acceptc()
    {
        System.out.print("ENTER COLLEGE NUMBER:");
        cid=sc.nextInt();
        System.out.print("ENTER COLLEGE NAME:");
        cname=sc.next();
        System.out.print("ENTER COLLEGE ADDRESS:");
        cadd=sc.next();
    }
}

class Student extends College
{
    int rno;
    String sname;
    float per;
    void accepts()
    {
        System.out.print("ENTER STUDENT ROLL NUMBER:");
        rno=sc.nextInt();
        System.out.print("ENTER STUDENT NAME:");
        sname=sc.next();
        System.out.print("ENTER STUDENT PERSENTAGE:");
        per=sc.nextFloat();
    }
    void display()
    {
        System.out.println("\nCOLLEGE ID:"+cid);
        System.out.println("COLLEGE NAME:"+cname);
        System.out.println("COLLEGE ADDRESS:"+cadd);
        System.out.println("STUDENT ROLL NO:"+rno);
        System.out.println("STUDENT NAME:"+sname);
        System.out.println("STUDENT PERSENTAGE:"+per);
    }
}

class Teacher extends College
{
    int tno;
    String tname;
    float sal;
    void acceptt()
    {
        System.out.print("ENTER TEACHER NUMBER:");
        tno=sc.nextInt();
        System.out.print("ENTER TEACHER NAME:");
        tname=sc.next();
        System.out.print("ENTER TEACHER SALARY:");
        sal=sc.nextFloat();
    }
    void display()
    {
        
        System.out.println("\nCOLLEGE ID:"+cid);
        System.out.println("COLLEGE NAME:"+cname);
        System.out.println("COLLEGE ADDRESS:"+cadd);
        System.out.println("TEACHER NO:"+tno);
        System.out.println("TEACHER NAME:"+tname);
        System.out.println("TEACHER SALARY:"+sal);
    }
}

public class hierachical_inheritance {
    public static void main(String[] args) {
        Teacher ob1=new Teacher();
        Student ob2=new Student();
        ob1.acceptc();
        ob1.acceptt();
        ob2.acceptc();
        ob2.accepts();
        ob1.display();
        ob2.display();
    }
}
