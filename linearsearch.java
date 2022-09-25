import java.util.Scanner;
class linearsearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Please enter the no. of elements of the array:");
        n1 = sc.nextInt();
        int arr[] = new int[n1];
        System.out.println("Enter the elements of the array:");
        for(int i = 0;i<n1;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Please enter the search element:");
        int s = sc.nextInt();
        int flag=0;
        int index = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]==s)
            {
                flag++;
                index = i;
            }
        }
        if(flag>0)
        System.out.println("The search element was found at index: "+index);
        else
        System.out.println("The search element was not found");
    }
}
        