import java.util.*;
public class bitWoseDivisibility {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int diviser=sc.nextInt();
        if((num &(diviser-1))==0)
        {
            System.out.println("divisible");
        }
        else
        {
          System.out.println(" not divisible");

        }
    }
}
