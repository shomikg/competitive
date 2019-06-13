package Implementation;


import java.util.Scanner;
import java.io.*;
class Grading_Students
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=-1;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            int ext=num%10;
            if(num<38)
            ans[++count]=num;
            else
            {
            if((ext>2)&&(ext<5))
            num+=(5-ext);
            else if((ext>7))
            num+=(10-ext);
            ans[++count]=num;
        }
        }
        for(int i=0;i<n;i++)
        System.out.println(ans[i]);
    }
}