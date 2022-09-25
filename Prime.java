// checks wether the no. entered is prime or not
import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Please enter a no.:");
        n = sc.nextInt();
        int factor = 0;
        for(int i = 2;i<=n;i++)
        {
            if(n%i==0)
            {
                factor++;
            }
            else
            {
            }
        }
        if(factor<=1)
        System.out.println("The no. entered is Prime");
        else
        System.out.println("The no. entered is not Prime");
    }
}