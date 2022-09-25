// takes a no. and checks wether it is a disraium no. or not
import java.util.Scanner;
class Disarium
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Please enter a no. to check wether it is a Disarium no. or not:");
        s = sc.nextLine();
        int len = s.length();
        int n = Integer.parseInt(s);
        double sum = 0.0;
        int no = n;
        while(n>0)
        {
            int d = n%10;
            sum = sum+Math.pow(d,len);
            n = n/10;
            len--;
        }
        if(sum==no)
        System.out.println(no+" is a Disarium no.");
        else
        System.out.println(no+" is not a Disarium no.");
    }
}