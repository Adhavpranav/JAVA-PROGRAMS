import java.util.*;
public class string_reverse {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER A STRING:");
    String s1=sc.next();
    for(int i=s1.length()-1;i>=0;i--)
    {
        System.out.print(s1.charAt(i));
    }
    sc.close();
 }   
}
