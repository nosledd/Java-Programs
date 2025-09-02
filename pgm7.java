import java.util.Scanner;
public class pgm7 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter no. of columns");
        int cols=sc.nextInt();
        int[][] matrix1=new int[rows][cols];
    

        System.out.println("Enter no. for matrix:");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                matrix1[i][j]=sc.nextInt();
            }
        }


        for(int i=0;i<rows;i++) {
            int sum=0;
            for(int j=0;j<cols;j++) {
             sum=sum+matrix1[i][j];
            }
              System.out.println("Sum of row"+(i+1)+"is"+sum);
        }
    }
}
