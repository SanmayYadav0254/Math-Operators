import java.util.Scanner;
class decrypter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = "";
        System.out.println("Input:");
        s = sc.nextLine();
        String s1 = "";
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='a')
            {
                s1 = s1+'z';
            }
            else if(c==' ')
            {
                s1 = s1+' ';
                continue;
            }
            s1 = s1+(char)(c-1);
        }
        System.out.println("The decrypted message is: "+s1);
    }
}