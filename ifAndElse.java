
import java.util.Scanner;

public class ifAndElse {
    public static void main(String[] args) {
       System.out.println("Enter the age");
       Scanner sc =new Scanner(System.in);
       int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("selected");

        }
        else
        {
            System.out.println("Rejected");
        }
    }
    
}
