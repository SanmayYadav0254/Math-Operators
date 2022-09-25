class variance
{
    public static void main(String args[])
    {
        double arr[] = {45.0,70.0,62.0,60.0,50.0,48.0,67.0,34.0,65.0,58.0};
        double mean = 55.9;
        double sum = 0;
        for(int i = 0;i<arr.length;i++) 
        {
            double square1 = arr[i]-mean;
            double square2 = square1*square1;
            sum = sum+square2;
        }
        double variance = sum/10;
        double SD = Math.sqrt(variance);
        System.out.println(variance);
        System.out.println(SD);
    }
}