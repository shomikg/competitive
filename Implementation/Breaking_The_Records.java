package Implementation;

import java.util.Scanner;
import java.io.*;
class Breaking_The_Records
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        a[0]=sc.nextInt();
        int max=a[0];
        int min=a[0];
        int count1=0,count2=0;
        for(int i=1;i<n;i++)
        {
        a[i]=sc.nextInt();
        if(a[i]>max)
        {
            max=a[i];
            count1++;
            
        }
        if(a[i]<min)
        {
            min=a[i];
            count2++;
        }
    }
    System.out.println(count1+" "+count2);
        
    }
}