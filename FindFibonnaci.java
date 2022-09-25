import java.util.Scanner;
class FindFibonnaci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Please enter the index no. of the fibonacci no. you want to find (it shoul not be zero):");
        n = sc.nextInt();
        if(n==1||n==2)
        {
            System.out.println("Fib no: 1");
        }
        else
        {
            int arr[] = new int[n+1];
            arr[1] = 1;
            arr[2] = 2;
            for(int i =3;i<=n;i++)
            {
                arr[i] = arr[i-1]+arr[i-2];
            }
            int result = arr[n-1];
            System.out.println("Fib no.: "+result);
        }
    }
}
        