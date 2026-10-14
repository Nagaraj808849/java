
import java.util.Scanner;

public class evenOdd3 {
   public static boolean  isEven(int num)
   {
    if(num%2==0)
    {
        return true;
    }
    else{
        return false;
    }
   }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number to check it even or odd");
       int num=sc.nextInt();
       boolean res=isEven(num);
       if(res)
       {
        System.out.println("even");
       }
       else{
        System.out.println("odd");
       }


   }
    
}
