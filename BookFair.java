// shows the name and the price of a book after discount in a book fair
import java.util.Scanner;
class BookFair
{
    String Bname;
    double price;
    public BookFair()
    {
        Bname = "";
        price = 0.0;
    }
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter book name:");
        Bname = sc.nextLine();
        System.out.println("Please enter the book price:");
        price = sc.nextDouble();
        sc.close();
    }
    public void Calculate()
    {
        double discount = 0.0;
        if(price<=1000)
        discount = (price*2)/100;
        else if(price>1000&&price<=3000)
        discount = 20+(price-1000)*10/100;
        else if(price>3000)
        discount = 220+(price-3000)*15/100;
        else
        {
        }
        price = price-discount;
    }
    public void Display()
    {
        System.out.println("Book name:"+Bname);
        System.out.println("Price after discount:"+price);
    }
    public static void main(String args[])
    {
        BookFair obj = new BookFair();
        obj.Input();
        obj.Calculate();
        obj.Display();
    }
}