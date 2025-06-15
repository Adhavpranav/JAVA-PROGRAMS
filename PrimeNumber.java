import java.util.Scanner;
public class primeno {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int num = sc.nextInt();
        sc.close();

        if (num <= 1) {
            System.out.println("GIVEN NUMBER IS NOT PRIME");
            return;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println("GIVEN NUMBER IS NOT PRIME");
                return;
            }
        }

        System.out.println("GIVEN NUMBER IS PRIME");
    }
}
