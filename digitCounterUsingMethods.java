
import java.util.Scanner;

public class digitCounterUsingMethods {
    public int digitCount(int num,int count)
    {
        for(int i=num;i>0;i=i/10)
        {
            count++;
        }
        return count;
        
    }
    public int maxOfThree(int a,int b,int c)
    {
        int max = (a>b && a>c)?a:(b>c)?b:c;
        return max;
    }
    public int palidrome(int num)
    {
       int rem=0,rev=0;
       int temp=num;
       while(num>0)
       {
         rem=num%10;
         rev=rev*10+rem;
         num=num/10;
       }
       if(temp==rev)
       {
        return 0;

       }
       else{
        return 1;
       }
    }
    public static void main(String[] args) {
        int count=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number to find its digits");
        int num=obj.nextInt();

        digitCounterUsingMethods obj1=new digitCounterUsingMethods();
       int digit= obj1.digitCount(num, count);
       System.out.println(digit);
       System.out.println(obj1.maxOfThree(10, 20, 30));
        System.out.println("Enter the number to find palidrome or not");
        int num1=obj.nextInt();
        
        if(obj1.palidrome(num1)==0)
        {
            System.out.println("its palidrome");
        }
        else{
            System.out.println("it not palidrome");
        }

    }
    
}
