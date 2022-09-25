import java.util.Scanner;
public class SpecialNumber
{
    static SpecialNumber obj = new SpecialNumber();
    public int Factorial(int n)
    {
        int fact = 1;
        for(int i = 1;i<=n;i++)
        {
            fact = fact*i;
        }
        return fact;
    }
    public int SumOffact(int num)
    {
        int sum = 0;
        while(num>0)
        {
            int digit = num%10;
            sum = sum+obj.Factorial(digit);
            num = num/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Please enter a no.:");
        n = sc.nextInt();
        int sum = obj.SumOffact(n);
        if(n==sum)
        System.out.println("The no. entered is a special no.:");
        else
        System.out.println("The no. entered is not a special no.:");
    }
}
        