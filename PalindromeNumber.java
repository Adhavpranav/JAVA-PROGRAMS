import java.util.Scanner;
public class palindromeno {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,temp,digit,rev=0;
        System.out.print("ENTER A NUMBER:");
        num=sc.nextInt();
        temp=num;
        while(temp>0)
        {
            digit=temp%10;
            rev=(rev*10)+digit;
            temp=temp/10;
        }
        if(rev==num)
        System.out.println("GIVEN NUMBER IS PALINDROME");
        else
        System.out.println("GIVEN NUMBER IS NOT PALINDROME");
        sc.close();
    }
}
