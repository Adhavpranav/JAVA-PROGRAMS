import java.util.*;
public class factorial {
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.print("ENTER A NUMBER:");
    int num=sc.nextInt();
    int fact=1;
    for(int i=1;i<=num;i++)
    fact=fact*i;
    System.out.println("FACTORIAL OF A NUMBER IS:"+fact);
    sc.close();
 }   
}
