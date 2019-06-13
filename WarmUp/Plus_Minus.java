import java.util.Scanner;
public class Plus_Minus
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int pos,neg,zero;
        pos=0;neg=0;zero=0;
        for(int i=0;i<n;i++)
        {
          int num=sc.nextInt();
          if(num>0)
          pos++;
          else if(num<0)
          neg++;
          else
          zero++;
        }
        System.out.printf("%.6f\n",((double)pos)/n);
        System.out.printf("%.6f\n",((double)neg)/n);
        System.out.printf("%.6f",((double)zero)/n);
    }
}