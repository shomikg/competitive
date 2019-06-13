package Implementation;

import java.util.Scanner;
class Kangaroo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int v1=sc.nextInt();
        int x2=sc.nextInt();
        int v2=sc.nextInt();
        double ans=(x2-x1)/(double)(v1-v2);
        if(ans<0)
        System.out.println("NO");
        else
        {
        if((Double.toString(ans)).charAt(Double.toString(ans).length()-1)=='0')
        System.out.println("YES");
        else
        System.out.println("NO");
    }

}
}