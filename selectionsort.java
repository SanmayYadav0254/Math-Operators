import java.util.Scanner;
class selectionsort
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
            int min = i;
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("The sorted array is:");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}