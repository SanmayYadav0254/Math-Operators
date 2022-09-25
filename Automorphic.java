// checks wether a no. is Automorphic or not
import java.util.Scanner;
class Automorphic
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Please enter a no. to check wether it is a Automorphic no.:");
        n = sc.nextInt();
        int sq = n*n;
        String num = Integer.toString(n);
        String square = Integer.toString(sq);
        if(square.endsWith(num))
        System.out.println(n+" is a Automorphic no.");
        else
        System.out.println(n+" is not a Automorphic no.");
    }
}