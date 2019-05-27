import java.util.Scanner;
class Staircase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int i2=1;i2<=n-i;i2++)
            System.out.print(" ");
            for(int i2=1;i2<=i;i2++)
            System.out.print("#");
            System.out.println();
        }
    }
}