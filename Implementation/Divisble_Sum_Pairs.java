package Implementation;

import java.util.Scanner;
import java.io.*;
class Divisble_Sum_Pairs
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int i2=i+1;i2<n;i2++)
            {
                if(((a[i]+a[i2])%k)==0)
                count++;
            }
        }
        System.out.println(count);
    }
}