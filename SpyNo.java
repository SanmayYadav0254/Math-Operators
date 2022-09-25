import java.util.Scanner;
class SpyNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Please enter a no.:");
        n = sc.nextInt();

        int p =1;
        int sum = 0;
        while(n>0)
        {
            int nu = n%10;
            sum = sum+nu;
            p = p*nu;
            n = n/10;
        }
   
        
        if(sum==p)
        System.out.println("The no. entered is a Spy no.");
        else
        System.out.println("The no. entered is not a Spy no.");
    }
}