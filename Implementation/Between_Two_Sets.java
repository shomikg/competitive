package Implementation;

import java.util.Scanner;
class Between_Two_Sets
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int min=101;
        int max=0;
        for(int i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        if(a[i]>max)
        max=a[i];
    }
        for(int i=0;i<m;i++)
        {
        b[i]=sc.nextInt();
        if(b[i]<min)
        min=b[i];
        
    }
    int count=0;
    for(int i=max;i<=min;i++)
    {
        int k1=0;
        int k2=0;
        for(int i2=0;i2<n;i2++)
        {
            if(i%a[i2]!=0)
            {
            k1=1;
            break;
        }
        }
         for(int i2=0;i2<m;i2++)
        {
            if(b[i2]%i!=0)
            {
            k2=1;
            break;
        }
        }
        if((k1==0)&&(k2==0))
        count++;
    }
    System.out.println(count);
}
}