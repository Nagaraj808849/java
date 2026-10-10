
import java.util.Scanner;

public class promblemsOnNestedLoops {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
       System.out.println("***************Trianle******************");
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=5-i;j++)
            {
              System.out.print(" ");
            }
           
            for(int j=0;j<=i;j++)
            {
              System.out.print("* ");
            }
            System.out.println();

        }
       System.out.println("**************Diamond************");
       int n=5;
      
        for(int i=0;i<=n*2;i++)
        {
            int space=n>i?n-i:i-n;
           int star=n>i?i:2 * (2 * n - i) ;
            
            for(int j=0;j<=space;j++)
            {
              System.out.print(" ");
            }
           
            for(int j=0;j<=star;j++)
            {
              System.out.print(" *");
            }
            System.out.println();

        
        }
      /*   System.out.println("*******Armstrong number**********");
       
        System.out.println("Enter the number to check its armstrong or not");
        int num=sc.nextInt();
        int rem=0,sum=0,temp=0;
        temp=num;
        while(num!=0)
        {
          rem=num%10;
          sum=sum+(rem*rem*rem);
          num=num/10;
        }
        if(sum==temp)
        {
            System.out.println("it is armstrong number");
        }
        else
        {
         System.out.println("it is not armstrong number");

        }*/

       /* System.out.println("*******sum of n even numbers*****");
        System.out.println("Enter the number ");
        int number=sc.nextInt();
        int sum1=0;
        for(int i=2;i<=number;i+=2)
        {
            sum1=sum1+i;
        }
        System.out.println("sum:"+sum1);*/

     /*    System.out.println("******prime or not*****");
        System.out.println("Enter the number to find its prime or not");
        int num=sc.nextInt();
        if(num<=1)
        {
            System.out.println("its not prime");
        }
        else{
           int flag=0;
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
              
            }
        }
        if(flag==0)
        {
            System.out.println("its prime number");
        }
        else
        {
            System.out.println("its not prime");
        }
    }
*/
    /*  System.out.println("****palidrone or not*****");
     System.out.println("Enter the number");
     int num=sc.nextInt();
     int rem=0,sum=0,temp=0;
        temp=num;
        while(num!=0)
        {
          rem=num%10;
          sum=(sum*10)+rem;
          num=num/10;
        }
        if(sum==temp)
        {
            System.out.println("the number is plaidrome");
        }
        else
        {
         System.out.println("the number is not palidrome");

        }
*/

    /* System.out.println("patten printing");

     int a=1;
     for(int i=1;i<=3;i++)
     {
        for(int j=1;j<=3;j++)
        {
           System.out.print(a);
           a++;
        }
        System.out.println();
     }*/
    


       
        }
    }
    

