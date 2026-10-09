
import java.util.Scanner;

public class problemsOnLoops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* int sum=0;
        System.out.println("Enter the n number to sum");
        int num=sc.nextInt();
        for(int i=0;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum:"+sum);*/
        int fact=1;
        System.out.println("Enter the  number to find factorial");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of" +num+ " is:"+fact);

        sc.close();
    }
    
}
