/* A Smith number is a composite number for which, in a given number base, 
   the sum of its digits is equal to the sum of the digits in its prime
   factorization in the given number base.
   For example : */
import java.util.Scanner;
class SmithNumber
{
    public int BreakandAdd(int f)
    {
        int sum = 0;
        while(f>0)
        {
            int m = f%10;
            sum = sum+m;
            f = f/10;
        }
        return sum;
    }
    public boolean checkPrime(int n)
    {
        int j = 0;
        boolean flag = false;
        
        for(int i = 2;i<=n;i++)
        {
            if(n%i==0)
            {
                j++;
            }
        }
        if(j==1)
        {
            flag = true;
        }
        return flag;
    }
    public int primeFactors(int n)
    {
        int sum = 0;
        for(int i =2;i<n;i++)
        {
            int factor = 0;
            if(checkPrime(i))
            {
                if(n%i==0)
                {
                    factor = i;
                    
                }
            }
        
            int f = BreakandAdd(factor);
        
            sum = sum+f;
        }
        return sum;
    }
            
    public static void main(String args[])
    {
        SmithNumber obj = new SmithNumber();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Please enter a no. to check wether it is a Smith no.:");
        n = sc.nextInt();
        int sf = obj.primeFactors(n);
        int sod = obj.BreakandAdd(n);
        if(sf==sod)
        System.out.println(n+" is a Smith no.");
        else
        System.out.println(n+" is not a Smith no.");
    }
}