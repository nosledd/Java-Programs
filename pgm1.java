import java.util.Scanner;
public class pgm1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name:");
        String name=sc.nextLine();
        System.out.println("Enter the 1 mark");
        int mark1=sc.nextInt();
         System.out.println("Enter the 2 mark");
        int mark2=sc.nextInt();
         System.out.println("Enter the 3 mark");
        int mark3=sc.nextInt();
        int total=mark1+mark2+mark3;
        int avg=total/3;
        System.out.println("The total is: "+total);
        System.out.println("The avg is: "+avg);
        if(avg>=85)
        {
          System.out.println("A"); 
        }
        else if(avg>=65)
        {
            System.out.println("B");
        }
        else if(avg>=30)
        {
          System.out.println("C");  
        }
         else
         {
            System.out.println("Fail");  
         }
    }
    
}

//My first git code