import java.util.Scanner;
class BinaryConverter
{
    public void Converter(int n)
    {
        String binary = "";
        int no =  0;
        while(n>0)
        {
            int m = n%2;
            String j = String.valueOf(m);
            no = no+(10*m);
            binary = binary+j;
            n = (n-m)/2;
        }
        int len = binary.length();
        String rev = "";
        for(int i = len-1;i>=0;i--)
        {
            rev = rev+binary.charAt(i);
        }
        System.out.println("Binary no.: "+rev);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        BinaryConverter obj = new BinaryConverter();
        int no;
        System.out.println("Please enter the no. to be converted:");
        no = sc.nextInt();
        obj.Converter(no);
    }
}