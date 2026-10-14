
import java.util.Scanner;

public class evenOrOddUsingMethods {

   public static void evenOrOdd(int a)
    {
        if(a%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number to check the number is even or odd");
        int a=obj.nextInt();
        evenOrOdd(a);
        
    }
}
