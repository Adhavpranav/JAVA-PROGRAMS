import java.util.Scanner;
public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, rev = 0, digit;
        System.out.print("ENTER A NUMBER: ");
        num = sc.nextInt();

        while (num > 0) {
            digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }

        System.out.println("REVERSE NUMBER IS: " + rev);
        sc.close();
    }
}
