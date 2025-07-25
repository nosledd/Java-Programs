import java.util.Scanner;
public class pgm9 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input=sc.nextLine();
        System.out.println("Enter starting position and no. of Charcters: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Extracted String:"+input.substring(m-1,m+n-1));
    }
    
}

// Note: Its so easy, dare you say this program is difficult
