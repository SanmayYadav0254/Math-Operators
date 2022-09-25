import java.util.Scanner;
class TaxCalculator
{
    String name= "";
    int asalary;
    int asaving;
    int ti;
    double it;
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the employee's name:");
        name = sc.next();
        System.out.println("Please enter the annual salary:");
        asalary = sc.nextInt();
        System.out.println("Please enter the annual saving:");
        asaving = sc.nextInt();
    }
    public void Calculate()
    {
        ti = asalary-asaving;
        if(ti<=350000)
        it = 0;
        else if(ti>350000&&ti<=600000)
        it = (ti-350000)*0.15;
        else if(ti>600000&&ti<=1000000)
        it = (250000*0.15)+(ti-600000)*0.25;
        else
        it = (250000*0.15)+(400000*0.25)+(ti-1000000)*0.35;
    }
    public void Output()
    {
        System.out.println("Employee's name:"+name);
        System.out.println("Annual salary:"+asalary);
        System.out.println("Annual savings:"+asaving);
        System.out.println("Taxable income:"+ti);
        System.out.println("Income tax:"+it);
    }
    public static void main(String args[])
    {
        TaxCalculator obj = new TaxCalculator();
        obj.Input();
        obj.Calculate();
        obj.Output();
    }
}