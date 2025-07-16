//Fibonacci

import java.util.Scanner;
public class pgm4 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c;
        System.out.println("Enter the lowest value: ");
        int low=sc.nextInt();
        System.out.println("Enter the highest value: ");
        int high=sc.nextInt();
        System.out.println("The Fibonacci series is");
        for(int i=0;i<=high;i++)
        {
          if(a>=low && a<=high)
          {
            System.out.println(a+" ");
          }  
            c=a+b;
            a=b;
            b=c; 
        }
      } 
    }