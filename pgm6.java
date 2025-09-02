import java.util.Scanner;
public class pgm6 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int rows=sc.nextInt();
        System.out.println("Enter no. of columns");
        int cols=sc.nextInt();
        int[][] matrix1=new int[rows][cols];
        int[][] matrix2=new int[rows][cols];
        int[][] add=new int[rows][cols];
        int[][] sub=new int[rows][cols];
        
        
        System.out.println("Enter no. for matrix 1:");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                matrix1[i][j]=sc.nextInt();
            }
        }
  

        System.out.println("Enter no. for matrix 2:");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                matrix2[i][j]=sc.nextInt();
            }
        }
  
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
              add[i][j]=matrix1[i][j]+matrix2[i][j];
              sub[i][j]=matrix1[i][j]-matrix2[i][j];
            }
        }

      
         for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
              System.out.println("Answer: "+add[i][j]);
              System.out.println("Answer: "+sub[i][j]);
            }
        }

    }
    
}
