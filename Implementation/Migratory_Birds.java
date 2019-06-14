package Implementation;



import java.util.Scanner;
class Migratory_Birds
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int count=0;
        int a[]=new int[5];
        for(int i=0;i<n;i++)
        a[sc.nextInt()-1]++;
        for(int i=0;i<5;i++)
        {
            if(a[i]>count)
            {
            count=a[i];
            max=i;
        }
            
        }
        System.out.println(max+1);
    }
}
