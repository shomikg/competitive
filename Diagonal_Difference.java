import java.util.Scanner;
class Diagonal_Difference
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum1=0,sum2=0;
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int i2=0;i2<n;i2++)
            {
                a[i][i2]=sc.nextInt();
                
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int i2=0;i2<n;i2++)
            {
                if(i==i2)
                sum1=sum1+a[i][i2];
                if(i==n-1-i2)sum2=sum2+a[i][i2];
                
            }
        }
        
        System.out.println(Math.abs(sum1-sum2));
    }
}
