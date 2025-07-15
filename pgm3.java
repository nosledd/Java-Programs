import java.util.Scanner;
public class pgm3 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 1st number: ");
    int n1=sc.nextInt();
    System.out.println("Enter the 2nd number: ");
    int n2=sc.nextInt();
    int sum=0;
    while(n1!=0 && n2!=0) {
    int num1=n1%10;
    int num2=n2%10;
    sum=sum+(num1*num2);
    n1=n1/10;
    n2=n2/10;
}
    System.out.println("Answer: "+sum);
}

}
