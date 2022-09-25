import java.util.Scanner;
class HarshadNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Please enter a no. to check wether it is a Harshad no. or not:");
        n = sc.nextInt();
        int sum = 0;
        int no = n;
        while(n>0)
        {
            int m = n%10;
            sum = sum+m;
            n = n/10;
        }
        if(no%sum==0)
        System.out.println("The no. "+no+" is a Harshad no.");
        else
        System.out.println("The no. "+no+" is not a Harshad no.");
    }
}
