import java.util.Scanner;
class Birthday_Cake_Candles
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[10000001];
        int max=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[a[i]]++;
            if(a[i]>max)
            max=a[i];
        }
        System.out.println(b[max]);
    }
}