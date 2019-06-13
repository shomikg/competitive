import java.util.Scanner;
import java.io.*;
class Time_Conversion
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        sc.useDelimiter(":");
        String h=sc.next();
        String m=sc.next();
        sc.useDelimiter("\\n");
        String s=sc.next();
        String st;
        st=s.substring(3,5);
        s=s.substring(1,3);
        if(st.equals("AM"))
        {
            if(Integer.parseInt(h)==12)
            h="00";
        }
        else
        {
            if(Integer.parseInt(h)!=12)
            h=Integer.toString(12+Integer.parseInt(h));
        }
        System.out.println(h+":"+m+":"+s);
    }
}