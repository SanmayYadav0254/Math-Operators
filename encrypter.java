import java.util.Scanner;
class encrypter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = "";
        String s1 = "";
        System.out.println("Input:");
        s = sc.nextLine();
        s = s.trim();
        s = s.toLowerCase();
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='z')
            {
                s1 = s1+'a';
            }
            else if(c==' ')
            {
                s1 = s1+" ";
                continue;
            }
            s1 = s1+(char)(c+1);
        }
        System.out.println("The Encrypted message is: "+s1);
    }
}