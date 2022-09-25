import java.util.Scanner;
class HighestCommonFactor
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Please enter the first no.:");
        n1 = sc.nextInt();
        System.out.println("Please enter the second no.:");
        n2 = sc.nextInt();
        int hcf = 1;
        int lno = Math.min(n1,n2);
        for(int i = 1;i<=lno;i++)
        {
            if(n1%i==0&&n2%i==0)
            {
                hcf = i;
            }
        }
        System.out.println("The Highest Common Factor of the two no.s "+n1+" and "+n2+" is: "+hcf);
    }
}