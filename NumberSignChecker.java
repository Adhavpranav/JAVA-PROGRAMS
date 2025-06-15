import java.util.*;

interface NumberCheck {
    void check(int num);
}

public class InterfaceProgram2 implements NumberCheck {
    public void check(int num) {
        if (num > 0)
            System.out.println("GIVEN NUMBER IS POSITIVE");
        else if (num < 0)
            System.out.println("GIVEN NUMBER IS NEGATIVE");
        else
            System.out.println("GIVEN NUMBER IS ZERO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int num = sc.nextInt();

        InterfaceProgram2 ob = new InterfaceProgram2();
        ob.check(num);

        sc.close();
    }
}
