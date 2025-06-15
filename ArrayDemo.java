import java.util.*;
public class array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ARRAY LIMIT:");
        int limit=sc.nextInt();
        int arr[]=new int[limit];
        System.out.printf("ENTER ARRAY ELEMENTS:");
        for(int i=0;i<limit;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("NUMBERS ARE:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("\t%d",arr[i]);
        }
        sc.close();
        return;
    }
}
