import java.util.Scanner;
class Mini_Max_Sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<5;i++)
        {
            for(int i2=0;i2<5-i;i2++)
            {
                if(a[i]>a[i+1])
                {
                    temp=a[i];
                    a[i]=a[i2];
                    a[i2]=temp;
                }
            }
        }
        int min=0,max=0;
        for(int i2=0;i2<5;i2++)
        {
            if(i2==0)
            min=min+a[i2];
            else if(i2==4)
            max=max+a[i2];
            else
            {
            min=min+a[i2];
            max=max+a[i2];
        }
        }
        System.out.println(min);
        System.out.println(max);
    }
}