import java.util.Scanner;
class Compare_The_Triplets
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];
        int alice=0,bob=0;
        for(int i=0;i<3;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<3;i++)
        b[i]=sc.nextInt();
        for(int i=0;i<3;i++)
        {
            if(a[i]>b[i])
            alice++;
            else if(a[i]<b[i])
            bob++;
            else;
        }
        System.out.println(alice + " " + bob);
    }
}