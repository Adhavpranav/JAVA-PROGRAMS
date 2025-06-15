import java.util.*;

public class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int num = sc.nextInt();
        int temp = num, digit, armstrongSum = 0;

        while (temp != 0) {
            digit = temp % 10;
            armstrongSum += digit * digit * digit;
            temp /= 10;
        }

        if (armstrongSum == num)
            System.out.println("GIVEN NUMBER IS AN ARMSTRONG NUMBER");
        else
            System.out.println("GIVEN NUMBER IS NOT AN ARMSTRONG NUMBER");

        sc.close();
    }
}
