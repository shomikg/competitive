package Implementation;

import java.util.Scanner;
class Birthday_Chocolate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int day=sc.nextInt();
        int month=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
         for(int i2=i;(i2<=(i+month-1))&&((i+month-1)<n);i2++)
         sum=sum+a[i2];
         if(sum==day)
         count++;
    }
    System.out.println(count);
}
}