import java.util.Scanner;
class BMindex
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double weight, height;
        float BMI = 0F;
        System.out.println("Please enter your weight in kg: ");
        weight = sc.nextDouble();
        System.out.println("Please enter your height in cm: ");
        height = sc.nextDouble();
        height = height/100;
        BMI = (float)(weight/Math.pow(height,2));
        System.out.println("Your BMI is: "+BMI);
    }
}