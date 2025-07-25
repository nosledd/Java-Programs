import java.util.Scanner;
class pay
{
    String name;
    double salary,da,hra,pf,gs,ns;
        
    pay(String n,double s)
    {
        name=n;
        salary=s;
    } 

    void calculate()
    {
     da=0.15*salary;
     hra=0.10*salary;
     pf=0.12*salary;
     gs=salary+da+hra;
     ns=gs-pf;
    }

    void display()
    {   
     System.out.println("Name: "+name);
     System.out.println("Salary: "+salary);
     System.out.println("DA: "+da);
     System.out.println("HRA: "+hra);
     System.out.println("PF: "+pf);
     System.out.println("Gross Salary: "+gs);
     System.out.println("Net Salary: "+ns);
    }
}

class pgm8 
{
 public static void main(String args[]) 
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Name: ");
    String n=sc.nextLine();
    System.out.println("Enter Salary: ");
    int s=sc.nextInt();
     System.out.println();
    pay p=new pay(n,s);
    p.calculate();
    p.display();
 }
}


    

