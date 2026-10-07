import java.util.*;
public class greatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+"greater");
        }
        else if(b>c)
        {
            System.out.println(b+"greater");
        }
        else
        {
            System.out.println(c+"greater");
        }

    }
}
