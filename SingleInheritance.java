import java.util.*;

class College {
    protected int cno;
    protected String cname, addr;
    Scanner sc = new Scanner(System.in);

    void accept_col() {
        System.out.print("ENTER COLLEGE NUMBER: ");
        cno = sc.nextInt();
        System.out.print("ENTER COLLEGE NAME: ");
        cname = sc.next();
        System.out.print("ENTER COLLEGE ADDRESS: ");
        addr = sc.next();
    }

    void display_col() {
        System.out.println("COLLEGE NUMBER: " + cno);
        System.out.println("COLLEGE NAME: " + cname);
        System.out.println("COLLEGE ADDRESS: " + addr);
    }
}

class Student {
    int rno;
    String sname;
    float per;
    Scanner sc = new Scanner(System.in);

    void accept_stud() {
        System.out.print("ENTER STUDENT ROLL NUMBER: ");
        rno = sc.nextInt();
        System.out.print("ENTER STUDENT NAME: ");
        sname = sc.next();
        System.out.print("ENTER STUDENT PERCENTAGE: ");
        per = sc.nextFloat();
    }

    void display_stud() {
        System.out.println("STUDENT ROLL NUMBER: " + rno);
        System.out.println("STUDENT NAME: " + sname);
        System.out.println("STUDENT PERCENTAGE: " + per);
        System.out.println("---------------------------");
    }
}

public class SingleInheritance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        College college = new College();
        college.accept_col();

        System.out.print("ENTER NUMBER OF STUDENTS: ");
        int limit = sc.nextInt();
        Student ob[] = new Student[limit];

        for (int i = 0; i < limit; i++) {
            ob[i] = new Student();
            ob[i].accept_stud();
        }

        System.out.println("\nCOLLEGE INFO:");
        college.display_col();

        System.out.println("\nSTUDENT DETAILS:");
        for (int i = 0; i < limit; i++) {
            ob[i].display_stud();
        }

        sc.close();
    }
}
