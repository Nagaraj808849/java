import java.util.*;
public class eligibleTOVote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        boolean nationlity = true;
        if(age>=18 && nationlity)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not eligible to vote");
        }
    }
}
