import java.util.*;
public class ATMPinVerification {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pin");
        boolean card=true;
        int pin=sc.nextInt();
       if(card)
       {
        if(pin==1234)
        {
            System.out.println("given pin is corcted");
        }
        else
        {
            System.out.println("pin is incorcted");
        }
       }
       else
       {
        System.out.println("card is incorrect");
       }

    }
}
 