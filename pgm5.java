import java.util.Scanner;
public class pgm5 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[50];
        System.out.println("No. of elements");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        if (a[a[i]]!=i)
         {
          System.out.println("Not Mirror");
          System.exit(0);
         }
        }
        System.out.println("Array is Mirror");   
    }    
}
