import java.util.Scanner;
class binarysearch
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
        
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Please enter the search element:");
        int s = sc.nextInt();
        int mid = arr.length/2;
        int midterm = arr[mid];
        if(s==midterm)
        {
            System.out.println("Element found at index: "+mid);
        }
        else if(s>midterm)
        {
            for(int i = arr[mid+1];i<arr.length;i++)
            {
                if(arr[i]==s)
                {
                    System.out.println("Element found at index: "+i);
                }
            }
        }
        else if(s<midterm)
        {
            for(int i = 0;i<mid;i++)
            {
                if(arr[i]==s)
                {
                    System.out.println("Element found at index: "+i);
                }
            }
        }
    }
}