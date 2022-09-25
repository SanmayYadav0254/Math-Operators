//displays the table of the no. entered
import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Please enter a no.:");
        n = sc.nextInt();
        System.out.println("The table of "+n+" is:");
        int mul = 1;
        for(int i = 1;i<=10;i++)
        {
            mul = n*i;
            System.out.println(n+"x"+i+":"+mul);
        }
    }
}