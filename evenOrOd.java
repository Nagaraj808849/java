
import java.util.Scanner;

public class evenOrOd {
//ststic and void
    public static void eveOrOd(int num)
    {
      if(num%2==0)
      {
        System.out.println("even");
      }
      else
        {
         System.out.println("odd");

      }
    }
    public static int even(int a)
    {
        if((a%2)==0)
        {
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int num=121;
       // eveOrOd(num);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find its even or odd");
        int num1=sc.nextInt();
  int res=even(num1);
       if(res==0)
       {
        System.out.println("even");
       }
       else{
        System.out.println("odd");
       }


    }
    
}
