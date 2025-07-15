import java.util.Scanner;
public class pgm2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st digit: ");
        int n1=sc.nextInt();
        System.out.println("Enter the 2nd digit: ");
        int n2=sc.nextInt();
        int result;
        for(int i=1;i<=4;i++) {
        System.out.println("Choose Operation: + - * / ");
        char op=sc.next().charAt(0);
        switch(op)
        {
            case'+':result=n1+n2;
                    System.out.println("Answer="+result );
                    break;
            case'-':result=n1-n2;
                    System.out.println("Answer="+result );
                    break;
            case'*':result=n1*n2;
                    System.out.println("Answer="+result );
                    break;
            case'/':if(n2==0)
                    break;
                    else 
                    result=n1/n2;
                    System.out.println("Answer="+result );
                    break;
            default:System.out.println("Invalid");
            System.exit(0);
        }

    } 

    }

    
}
