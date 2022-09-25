import java.util.Scanner;
class PronicNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Please enter a no. to check if it is a Pronic no. or not:");
        n = sc.nextInt();
        int tr = 0;
        for(int i = 1;i<n;i++)
        {
            int j = i+1;
            if(i*j == n)
            {
                tr = 1;
                System.out.println("Yes the no. is pronic and it is the product of "+i+"and "+j);
                break;
            }
        }
        if(tr==0)
        System.out.println("No the no. entered is not pronic");
    }
}