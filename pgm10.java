import java.util.Scanner;
class distance
{
    int feet, inch;
    distance(int f, int i)
    {
        feet=f;
        inch=i;
    }

     
    distance()
    {}

    void sum(distance d1, distance d2)
    {
        feet=d1.feet+d2.feet;
        inch=d1.inch+d2.inch;
        while(inch>=12)
        {
            feet++;
            inch=inch-12;
        }
        System.out.println("\n--Result--");
        System.out.println("Feet: " +feet+ "\nInch: " +inch);
    }
}

class pgm10
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first feet & inches: ");
        int f1=sc.nextInt();
        int i1=sc.nextInt();
        distance d1=new distance(f1, i1);
        System.out.println("\nEnter second feet & inches: ");
        int f2=sc.nextInt();
        int i2=sc.nextInt();
        distance d2=new distance(f2, i2);
        distance d3=new distance();
        d3.sum(d1, d2);

    }
}
