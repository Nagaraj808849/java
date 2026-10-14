
import java.util.Scanner;

public class evenOrOddinst1 {
    public int evenOrOd(int a)
    {
        if(a%2==0)
        {
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        evenOrOddinst1 obj=new evenOrOddinst1();
        int res=obj.evenOrOd(num);
        if(res==0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
    
}
