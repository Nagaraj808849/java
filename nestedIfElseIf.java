
import java.util.Scanner;

public class nestedIfElseIf {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the age");
     int age=sc.nextInt();
     System.out.println("Enter the percentage");
     int perc=sc.nextInt();

     if(age>=18)
     {
        if(perc>=90)
        {
            System.out.println("officer");
        }
        else if(perc>=80)
        {
            System.out.println("technical");
        }
        else if(perc>=60)
        {
            System.out.println("GD");
        }
        else
        {
            System.out.println("not qualified");
        }
     }
     else
     {
        System.out.println("age not eligible");
     }
     sc.close();
    }
}
